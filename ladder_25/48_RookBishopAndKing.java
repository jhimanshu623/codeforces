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
    public static void solve(int r1,int c1,int r2,int c2){
        int rook=0,bishop=0,king=0;
        rook=(r1==r2 || c1==c2)?1:2;
        int diff=(Math.abs(r1-r2)+Math.abs(c1-c2));
        if(diff%2==0){
            if((r1+c1 == r2+c2) || (r1-c1 == r2-c2)){
                bishop=1;
            }else{
                bishop=2;
            }
        }else{
            bishop=0;
        }
        int diff1=Math.abs(r1-r2);
        int diff2=Math.abs(c1-c2);
        king=Math.max(diff1,diff2);
        System.out.println(rook+" "+bishop+" "+king);
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        solve(r1,c1,r2,c2);
    }
}

