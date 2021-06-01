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
        long ans=0;
        int minx=Integer.MAX_VALUE, maxx=Integer.MIN_VALUE;
        int miny=Integer.MAX_VALUE, maxy=Integer.MIN_VALUE; 
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            minx=Math.min(minx,x);
            maxx=Math.max(maxx,x);
            miny=Math.min(miny,y);
            maxy=Math.max(maxy,y);
        }
        ans=Math.max(maxx-minx, maxy-miny);
        ans*=ans;
        System.out.println(ans);
    }
}

