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
    
    static class Pair
    {
        int mult;
        int val;
        Pair(int mult,int val)
        {
            this.mult=mult;
            this.val=val;
        }
    }
    public static void solve(int n,int x,int[] arr)
    {
        long sum=0;
        LinkedList<Pair> que=new LinkedList<>();
        for(int i=0;i<n;i++)
            que.addLast(new Pair(1,arr[i]));
 
        while(true)
        {
            Pair rp=que.removeFirst();
            sum+=rp.mult*rp.val;
            if(rp.val%x!=0)
                break;
            rp.mult=rp.mult*x;
            rp.val=rp.val/x;
            que.addLast(rp);
        }
        while(que.size()>0)
        {
            Pair rp=que.removeFirst();
            sum+=rp.mult*rp.val;
        }
        System.out.println(sum);
    }
    
    public static void solve2(int n,int x,int[] arr)
    {
        int min=Integer.MAX_VALUE;
        int midx=-1;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            int count=0;
            while(temp%x==0)
            {
                count++;
                temp=temp/x;
            }
            if(count<min)
            {
                min=count;
                midx=i;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i<midx)
                sum+=(long)arr[i]*(min+2);
            else
                sum+=(long)arr[i]*(min+1);
        }
        System.out.println(sum);        
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            solve2(n,x,arr);            
        }
    }
}

