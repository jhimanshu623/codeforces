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
        
        // If we don't use Math.min function and check every combination, that works faster.
        // check other solutions here -> https://codeforces.com/contest/366/status/A?order=BY_CONSUMED_TIME_ASC

        int n=sc.nextInt();
        boolean isFound=false;
        for(int i=0;i<4;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(isFound==false && Math.min(a,b)+Math.min(c,d)<=n){
                System.out.println((i+1)+" "+(Math.min(a,b))+" "+(n-Math.min(a,b)));
                isFound=true;
            }
        }
        if(isFound==false)
            System.out.println(-1);


    }
}

