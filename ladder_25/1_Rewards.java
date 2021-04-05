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
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        int a=sc.nextInt()+sc.nextInt()+sc.nextInt();
        int b=sc.nextInt()+sc.nextInt()+sc.nextInt();
        int n=sc.nextInt();
        if(n-Math.ceil(a*1.0/5) >= Math.ceil(b*1.0/10)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

/*
Because rewards of one type can be on one shelf, lets calculate number of cups — a and number of
medals — b. Minimum number of shelves that will be required for all cups can be found by
formula (a + 5 - 1) / 5. The same with shelves with medals: (b + 10 - 1) / 10.
If sum of this two values more than n then answer is "NO" and "YES" otherwise.
*/