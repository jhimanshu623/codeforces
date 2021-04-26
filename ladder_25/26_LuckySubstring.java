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
        int fours=0,sevens=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='4'){
                fours++;
            }else if(ch=='7'){
                sevens++;
            }
        }
        if(fours==0 && sevens==0){
            System.out.println(-1);
        }else{
            if(fours>=sevens){
                System.out.println(4);
            }else{
                System.out.println(7);
            }
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        String str=sc.next();
        solve(str);
    }
}

