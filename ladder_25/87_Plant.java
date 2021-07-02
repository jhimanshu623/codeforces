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
    
    // gives TLE
    public static void solve(long n){
        long u=1,d=0;
        int mod=1000000007;
        for(int i=1;i<=n;i++){
            long temp=u;
            u=((3*u)%mod+d)%mod;
            d=(temp+(3*d)%mod)%mod;
        }
        System.out.println(u);
    }
    
    public static long pow(long x,long p){
        if(p==0){
            return 1;
        }
        long ans=1;
        int mod=1000000007;
        while(p>1){
            if(p%2!=0){
                ans=(ans*x)%mod;
                p--;
            }
            x=(x*x)%mod;
            p=p/2;
        }
        ans=(ans*x)%mod;
        return ans;
    }
    // Number format exception at this input 74859961358140080
    public static void solve2(long n){
        int mod=1000000007;
        long ans=pow(2,n);
        ans=(ans*(ans+1)/2)%mod;
        System.out.println(ans);
    }

    // tutorial -> https://codeforces.com/blog/entry/4488
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        long n=sc.nextInt();
        // solve(n);
        solve2(n);
    }
}