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
    public static int solve(int n,int[][] arr){
        HashMap<Integer,Integer> guestMap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            guestMap.put(arr[i][1], guestMap.getOrDefault(arr[i][1], 0)+1);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=guestMap.getOrDefault(arr[i][0], 0);
        }
        return ans;
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        System.out.println(solve(n,arr));
    }
}

