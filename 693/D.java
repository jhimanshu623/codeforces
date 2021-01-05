import java.io.*;
import java.util.*;

public class Main
{
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
    
    // not recommended
    public static void solve(int n,int[] arr)
    {
        PriorityQueue<Integer> pqo=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pqe=new PriorityQueue<>(Collections.reverseOrder());
        for(int val:arr)
        {
            if(val%2==0)
                pqe.add(val);
            else
                pqo.add(val);
        }
        long as=0;
        long bs=0;
        int i=0;
        while(pqo.size()>0 && pqe.size()>0)
        {
            if(i%2==0)
            {
                if(pqo.peek()>pqe.peek())
                {
                    pqo.poll();
                }
                else{
                    as+=pqe.poll();
                }
            }
            else{
                if(pqe.peek()>pqo.peek())
                {
                    pqe.poll();
                }
                else{
                    bs+=pqo.poll();
                }
            }
            i++;
        }
 
        while(pqe.size()>0){
            int val=pqe.poll();
            if(i%2==0)
                as+=val;
            i++;
        }
        while(pqo.size()>0){
            int val=pqo.poll();
            if(i%2!=0)
                bs+=val;
            i++;
        }
        if(as>bs)
            System.out.println("Alice");
        else if(bs>as)
            System.out.println("Bob");
        else
            System.out.println("Tie");
    }

    public static void solve2(int n,int[] arr)
    {
        Arrays.sort(arr);
        long as=0;
        long bs=0;
        boolean isAlice=true;
        for(int i=n-1;i>=0;i--)
        {
            if(isAlice)
            {
                if(arr[i]%2==0)
                    as+=arr[i];
            }
            else
            {
                if(arr[i]%2!=0)
                    bs+=arr[i];
            }
            isAlice=!isAlice;
        }
        if(as>bs)
            System.out.println("Alice");
        else if(bs>as)
            System.out.println("Bob");
        else
            System.out.println("Tie");
    }
    
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            
            solve(n,arr);            
        }
    }
}

