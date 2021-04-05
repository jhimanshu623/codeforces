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
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)    
            arr[i]=sc.nextInt();
        int m=sc.nextInt();
        while(m-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x-2>=0)
                arr[x-2]+=y-1;
            if(x<n)
                arr[x]+=arr[x-1]-y;
            arr[x-1]=0;
        }
        for(int val:arr)
            System.out.println(val);
    }
}

// learning -> A good trick for the first and the last wire would be to define 
//             wires 0 and n + 1.In this way the birds that fly away sit on these wires
//             and you don't need to worry about accessing some element outside the 
//             range of your array