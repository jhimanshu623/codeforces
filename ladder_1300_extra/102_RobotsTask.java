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
    public static int solve(int n,int[] arr)
    {
        int info=0;
        int count=0;
        int dir=0;
        while(info<n)
        {
            if(dir==0)
            {
                for(int i=0;i<n;i++)
                {
                    if(arr[i]<=info && arr[i]!=-1)
                    {
                        info++;
                        arr[i]=-1;
                    }
                }
            }
            else
            {
                for(int i=n-1;i>=0;i--)
                {
                    if(arr[i]<=info && arr[i]!=-1)
                    {
                        info++;
                        arr[i]=-1;
                    }
                }
            }
            dir=1-dir;
            if(info<n)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(solve(n,arr));
    }
}

