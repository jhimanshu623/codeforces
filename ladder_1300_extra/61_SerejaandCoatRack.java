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
    
    public static int solve(int n,int d,int[] arr,int m)
    {
        if(m>=n)
        {
            int sum=0;
            for(int val:arr)
                sum+=val;
            return sum-(m-n)*d;
        }
        else
        {
            Arrays.sort(arr);
            int sum=0;
            for(int i=0;i<m;i++)
                sum+=arr[i];
            return sum;
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(solve(n,d,arr,m));        
    }
}

