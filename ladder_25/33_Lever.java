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
    public static void solve(String str){
        int n=str.length();
        int l=-1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='^')
                l=i;
        }
        long left=0,right=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)!='^' && str.charAt(i)!='='){
                if(i<l){
                    left+=(l-i)*(long)(str.charAt(i)-'0');
                }else{
                    right+=(i-l)*(long)(str.charAt(i)-'0');
                }
            }
        }
        if(left>right)
            System.out.println("left");
        else if(right>left)
            System.out.println("right");
        else
            System.out.println("balance");
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        String str=sc.next();
        solve(str);
    }
}

