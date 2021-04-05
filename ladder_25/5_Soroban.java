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
    public static void solve(int n){
        StringBuilder ans=new StringBuilder();
        if(n<5){
            ans.append("O-");
        }else{
            ans.append("-O");
            n-=5;
        }
        ans.append("|");
        for(int i=0;i<n;i++){
            ans.append("O");
        }
        ans.append("-");
        n=4-n;
        for(int i=0;i<n;i++){
            ans.append("O");
        }
        System.out.println(ans);
    }
    public static void solveRec(int num){
        int n=num/10;
        solve(num%10);
        if(n>0)
            solveRec(n);
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        int n=sc.nextInt();
        solveRec(n);
    }
}

