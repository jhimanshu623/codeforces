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
    public static int solve(int n,int m,int[][] arr){
        for(int i=0;i<n;i++){
            if(arr[i][0]==1){
                return 2;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i][m-1]==1){
                return 2;
            }
        }
        for(int j=0;j<m;j++){
            if(arr[0][j]==1){
                return 2;
            }
        }
        for(int j=0;j<m;j++){
            if(arr[n-1][j]==1){
                return 2;
            }
        }
        return 4;
    }
    public static int solve2(int n,int m,int[][] arr){
        for(int i=0;i<n;i++){
            if(arr[i][0]==1){
                return 2;
            }
            if(arr[i][m-1]==1){
                return 2;
            }
        }
        for(int j=0;j<m;j++){
            if(arr[0][j]==1){
                return 2;
            }
            if(arr[n-1][j]==1){
                return 2;
            }
        }
        return 4;
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // System.out.println(solve(n,m,arr));
        System.out.println(solve2(n,m,arr));
    }
}

