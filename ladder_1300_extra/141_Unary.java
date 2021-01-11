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
    
    public static int solve(String str)
    {
        HashMap<Character,String> map=new HashMap<>();
        map.put('>',"1000");
        map.put('<',"1001");
        map.put('+',"1010");
        map.put('-',"1011");
        map.put('.',"1100");
        map.put(',',"1101");
        map.put('[',"1110");
        map.put(']',"1111");

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            sb.append(map.get(str.charAt(i)));
        }
        int ans=0;
        int mod=1000003;
        int pow_2=1;
        for(int i=sb.length()-1;i>=0;i--)
        {
            if(sb.charAt(i)=='1')
            {
                ans=(ans+pow_2)%mod;
            }
            pow_2=(pow_2 * 2)%mod;
        }
        return ans;
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        String str=sc.next();
        System.out.println(solve(str));
    }
}