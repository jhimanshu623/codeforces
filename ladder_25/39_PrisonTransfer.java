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
    public static void solve(int n,int t,int c,int[] arr){
        int ans=0,outside_range=0;
        int s=0,e=-1;
        for(int i=0;i<c;i++){
            e++;
            if(arr[e]>t)
                outside_range++;
        }
        if(outside_range==0)
            ans++;
        while(e<n-1){
            e++;
            if(arr[e]>t)
                outside_range++;
            if(arr[s]>t)
                outside_range--;
            s++;
            if(outside_range==0)
                ans++;
        }
        System.out.println(ans);
    }

    // check tutorial here ->   https://codeforces.com/blog/entry/12082
    // check these solutions -> https://codeforces.com/contest/427/submission/68613834
                            //  https://codeforces.com/contest/427/submission/92990956
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int t=sc.nextInt();
        int c=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        solve(n,t,c,arr);
    }
}

