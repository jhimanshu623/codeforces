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
        HashMap<Integer,Integer> fmap=new HashMap<>();
        fmap.put(0, 2);
        fmap.put(1, 7);
        fmap.put(2, 2);
        fmap.put(3, 3);
        fmap.put(4, 3);
        fmap.put(5, 4);
        fmap.put(6, 2);
        fmap.put(7, 5);
        fmap.put(8, 1);
        fmap.put(9, 2);
        int ans=fmap.get(n%10);
        ans*=fmap.get(n/10);
        System.out.println(ans);
    }

    // better solution -> https://codeforces.com/contest/495/submission/78276048
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        solve(n);
    }
}

