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
    // O(n)time O(n) space solution 
    public static void solve(int n,String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(st.size()>0 && st.peek()!=ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        System.out.println(st.size());
    }

    // check tutorial here -> https://codeforces.com/blog/entry/18919
    // O(n)time O(1) space solution 
    public static void solve2(int n,String str){
        int zeros=0,ones=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='0') 
                zeros++;
            else if(ch=='1')
                ones++;
        }
        System.out.println(n-2*Math.min(zeros,ones));
    }

    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        String str=sc.next();
        // solve(n,str);
        solve2(n,str);
    }
}

