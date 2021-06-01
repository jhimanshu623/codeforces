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
    public static boolean isCommon(int n1,int n2){
        int[] digits=new int[10];
        while(n1>0){
            int d=n1%10;
            digits[d]=1;
            n1=n1/10;
        }
        while(n2>0){
            int d=n2%10;
            if(digits[d]==1){
                return true;
            }
            n2=n2/10;
        }
        return false;
    }
    public static void solve(int n){
        int ans=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                ans+=(isCommon(n,i))?1:0;
                if(i!=(n/i)){
                    ans+=(isCommon(n,n/i))?1:0;
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        solve(n);
    }
}

