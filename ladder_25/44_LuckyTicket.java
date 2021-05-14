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
    public static void solve(int len,String num){
        int sum=0;
        for(int i=1;i<=len;i++){
            char ch=num.charAt(i-1);
            if(ch!='4' && ch!='7'){
                System.out.println("NO");
                return;
            }
            if(i<=len/2){
                sum+=(ch-'0');
            }else{
                sum-=(ch-'0');
            }
        }
        if(sum==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int len=sc.nextInt();
        String num=sc.next();
        solve(len,num);
    }
}

