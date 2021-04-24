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
    public static int convertIntoMinutes(String str){
        int time=0;
        String[] arr=str.split(":");
        time+=Integer.parseInt(arr[0])*60;
        time+=Integer.parseInt(arr[1]);
        return time;
    }
    public static String minutesToString(int time){
        StringBuilder res=new StringBuilder();
        int hours=time/60;
        if(hours<10)
            res.append("0");
        res.append(hours);
        res.append(":");
        time-=hours*60;
        if(time<10)
            res.append("0");
        res.append(time);
        return res.toString();
    }
    public static boolean isPalindrome(String str){
        if(str.charAt(0)==str.charAt(4) && str.charAt(1)==str.charAt(3))
            return true;
        return false;
    }
    public static void solve(String str){
        int stime=convertIntoMinutes(str);
        int mod=24*60;
        stime=(stime+1)%mod;
        String ans="";
        while(true){
            String ctime=minutesToString(stime);
            if(isPalindrome(ctime)){
                System.out.println(ctime);
                return;
            }
            stime=(stime+1)%mod;
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        String str=sc.next();
        solve(str);
    }
}

