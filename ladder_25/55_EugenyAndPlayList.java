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
    public static void solve(int n,int m,long[] durations,int[] moments){
        for(int k=1;k<n;k++){
            durations[k]+=durations[k-1];
        }
        int i=0,j=0;
        while(j<m){
            while(j<m && moments[j]<=durations[i]){
                System.out.println(i+1);
                j++;
            }
            i++;
        }
    }
    // check other solutions here -> https://codeforces.com/contest/302/submission/74237288
    //                               https://codeforces.com/contest/302/submission/100841585
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        long[] durations=new long[n];
        for(int i=0;i<n;i++){
            durations[i]=(sc.nextInt()*sc.nextInt());
        }
        int[] moments=new int[m];
        for(int i=0;i<m;i++){
            moments[i]=sc.nextInt();
        }
        solve(n,m,durations,moments);
    }
}

