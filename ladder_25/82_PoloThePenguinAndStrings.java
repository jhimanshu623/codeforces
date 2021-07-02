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
    public static void solve(int n,int k){
        if(k>n){
            System.out.println(-1);
        }else if(k==1 && n>1){
            System.out.println(-1);
        }else if(k==1 && n==1){
            System.out.println("a");
        }else{
            int d=k-2;
            int rep=n-d;
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<rep;i++){
                if(i%2==0)
                    ans.append('a');
                else
                    ans.append('b');
            }
            for(int i=0;i<d;i++){
                ans.append((char)('a'+i+2));
            }
            System.out.println(ans.toString());
        }
    }
    // tutorial -> https://codeforces.com/blog/entry/7241
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        solve(n,k);
    }
}