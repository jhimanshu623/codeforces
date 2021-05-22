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
        int xc=0,yc=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='x'){
                xc++;
            }else{
                yc++;
            }
        }
        StringBuilder ans=new StringBuilder();
        if(xc>yc){
            xc=xc-yc;
            for(int i=0;i<xc;i++){
                ans.append('x');
            }
        }else{
            yc=yc-xc;
            for(int i=0;i<yc;i++){
                ans.append('y');
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        String str=sc.next();
        solve(str);
    }
}

