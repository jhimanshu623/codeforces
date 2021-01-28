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
    public static int gcd(int a,int b)
    {
        if(a%b==0)
            return b;
        return gcd(b,a%b);
    }
    public static void solve(String str1,String str2)
    {
        int a=str1.length(),b=str2.length();
        int lcm=((a*b)/gcd(a,b));
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<lcm;i++)
        {
            ans.append(str1.charAt(i%a));
        }
        int i=0;
        for(;i<lcm;i++)
        {
            if(ans.charAt(i)!=str2.charAt(i%b))
            {
                System.out.println(-1);
                break;
            }
        }
        if(i==lcm)
            System.out.println(ans);
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int t=sc.nextInt();
        while(t-->0)
        {
            String str1=sc.next();
            String str2=sc.next();
            solve(str1,str2);
        }
    }
}