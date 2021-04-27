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
    public static void solve(int n,String str){
        int inn=0,ans=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='I')
                inn++;
        }
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='A' && inn==0){
                ans++;
            }else if(ch=='I' && inn==1){
                ans++;
            }
        }
        System.out.println(ans);
    }
    public static void solve2(int n,String str){
        int A = 0;
        int I = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'){
                A++;
            }else if(s.charAt(i)=='I'){
                I++;
            }
        }
        if(I==0){
            System.out.println(A);
        }
        else {
            if(I==1){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        String str=sc.next();
        // solve(n,str);
        solve2(n,str);
    }
}

