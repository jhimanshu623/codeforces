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
        
        int t=sc.nextInt();
        while(t-->0)
        {
           int n=sc.nextInt();
           int d=sc.nextInt();
           int[] arr=new int[n];
           int s=Integer.MAX_VALUE;
           int ss=Integer.MAX_VALUE;
           boolean as=true;
           for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>d)
                    as=false;
                if(arr[i]<s)
                {
                    ss=s;
                    s=arr[i];
                }
                else if(arr[i]<ss)
                {
                    ss=arr[i];
                }
           }
           if(as || s+ss<=d)
                System.out.println("YES");
           else
                System.out.println("NO");
        }
    }
}

