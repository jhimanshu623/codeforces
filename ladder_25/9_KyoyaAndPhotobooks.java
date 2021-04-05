import java.io.*;
import java.util.*;

class Main
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
        int[] fmap=new int[26];
        int dc=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            fmap[ch-'a']++;
            if(fmap[ch-'a']==1)
                dc++;
        }
        int rc=26-dc;
        int ans=rc*(str.length()+1);
        for(int i=0;i<26;i++){
            if(fmap[i]!=0){
                ans+=(str.length()+1)-fmap[i];
            }
        }
        System.out.println(ans);
    }
    public static void solve2(String str){
        int l=str.length();
        System.out.println(26*(l+1)-l);
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        String str=sc.next();
        // solve(str);
        solve2(str);
    }
}

