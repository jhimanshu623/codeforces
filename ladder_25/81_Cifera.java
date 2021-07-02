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
    // ******** wrong division output on case-
    // ******** 581
    // ******** 196122941
    // public static void solve(int k,int l){
    //     double d=Math.log(l)/Math.log(k);
    //     System.out.println(d);
    //     if(Math.ceil(d) == Math.floor(d)){
    //         System.out.println("YES");
    //         System.out.println((int)d-1);
    //     }else{
    //         System.out.println("NO");
    //     }
    // }

    public static void solve(int k,int l){
        int count=0;
        while(l>1){
            if(l%k==0){
                l=l/k;
                count++;
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        System.out.println(count-1);
    }
    // tutorial -> https://codeforces.com/blog/entry/2627
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int k=sc.nextInt();
        int l=sc.nextInt();
        solve(k,l);
    }
}