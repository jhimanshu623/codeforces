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
    public static void solve(int m,int n,int[][] arr){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    arr[i][j]=arr[i][j];
                }else if(i==0){
                    arr[i][j]=arr[i][j-1]+arr[i][j];
                }else if(j==0){
                    arr[i][j]=arr[i-1][j]+arr[i][j];
                }else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1])+arr[i][j];
                }
                if(j==n-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
    }
    // check this solution -> https://codeforces.com/contest/416/submission/105630637
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        solve(m,n,arr);
    }
}

