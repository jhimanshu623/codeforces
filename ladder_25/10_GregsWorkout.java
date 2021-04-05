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
    public static void solve(int n,int[] arr){
        int ch=0,bi=0,ba=0;
        for(int i=0;i<n;i++){
            int idx=i%3;
            if(idx==0)
                ch+=arr[i];
            else if(idx==1)
                bi+=arr[i];
            else
                ba+=arr[i];
        }
        if(ch>bi && ch>ba){
            System.out.println("chest");
        }else if(bi>ch && bi>ba){
            System.out.println("biceps");
        }else{
            System.out.println("back");
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        solve(n,arr);
    }
}

