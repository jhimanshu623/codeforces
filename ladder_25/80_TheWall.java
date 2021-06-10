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
    public static int gcd(int x,int y){
        if(x==0){
            return y;
        }
        return gcd(y%x,x);
    }
    public static void solve(int x,int y,int a,int b){
        int lcm=x*y/gcd(x,y);
        int ans=b/lcm;
        ans-=(a-1)/lcm ;
        System.out.println(ans);
    }
    // check tutorial here -> https://codeforces.com/blog/entry/8755
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        solve(x,y,a,b);
    }
}