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
        int ans=0;
        int mid=n/2;
        int s=0,b=0;
        for(char ch:str.toCharArray()){
            if(ch=='x'){
                s++;
            }else if(ch=='X'){
                b++;
            }
        }
        StringBuilder ansString=new StringBuilder(str);
        if(s>b){
            ans=s-mid;
            int count=ans;
            for(int i=0;i<ansString.length();i++){
                if(ansString.charAt(i)=='x' && count>0){
                    ansString.setCharAt(i, 'X');
                    count--;
                }
            }
        }else if(b>s){
            ans=b-mid;
            int count=ans;
            for(int i=0;i<ansString.length();i++){
                if(ansString.charAt(i)=='X' && count>0){
                    ansString.setCharAt(i, 'x');
                    count--;
                }
            }
        }
        System.out.println(ans);
        System.out.println(ansString);
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        String str=sc.next();
        solve(n,str);
    }
}

