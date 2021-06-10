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
    public static boolean isEqual(String str,String check,int isStart){
        if(str.length()<5){
            return false;
        }
        if(isStart==1){
            for(int i=0;i<5;i++){
                if(str.charAt(i)!=check.charAt(i)){
                    return false;
                }
            }
        }else{
            for(int i=str.length()-5,j=0;i<str.length();i++,j++){
                if(str.charAt(i)!=check.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void solve(String str){
        if(isEqual(str,"miao.",1)==true && isEqual(str,"lala.",0)==false){
            System.out.println("Rainbow's");
        }else if(isEqual(str,"miao.",1)==false && isEqual(str,"lala.",0)==true){
            System.out.println("Freda's");
        }else{
            System.out.println("OMG>.< I don't know!");
        }
    }
    // shorter implementation -> https://codeforces.com/contest/312/submission/85875881
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            solve(sc.nextLine());
        }
    }
}

