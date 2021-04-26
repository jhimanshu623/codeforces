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
    public static void solve(int k,int d){
        if(d>0){
            StringBuilder ans=new StringBuilder();
            ans.append(d);
            for(int i=1;i<k;i++){
                ans.append("0");   
            }
            System.out.println(ans);
        }else if(d==0 && k==1){
            System.out.println(0);
        }else if(d==0 && k>1){
            System.out.println("No solution");
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int k=sc.nextInt();
        int d=sc.nextInt();
        solve(k,d);
    }
}

