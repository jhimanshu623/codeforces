import java.io.*;
import java.util.*;


// not submitted because of wrong test case (codeforces test case error) ->  
// input  -> 2 6
// my output -> 3, 2
// jury output -> 3, 4
  
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
    
    public static void solve(int n,int m)
    {
        int c=(m+1)/2;
        for(int i=0;i<n;i++)
        {
            int rem=i%m;
            if(rem%2==0)
            {
                System.out.println(c+rem/2);
            }
            else
            {
                if(rem==m-1)
                    System.out.println(c+(rem+1)/2);
                else
                    System.out.println(c-(rem+1)/2);
            }
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        int n=sc.nextInt();
        int m=sc.nextInt();
        solve(n,m);
    }
}

