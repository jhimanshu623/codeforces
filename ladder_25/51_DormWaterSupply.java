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
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int p=sc.nextInt();
        int[][] d=new int[n][n];
        int[] tt=new int[n];
        int[] path=new int[n];
        Arrays.fill(path,-1);
        for(int i=0;i<p;i++){
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            int di=sc.nextInt();
            d[a][b]=di;
            tt[a]+=1;
            tt[b]-=1;
            path[a]=b;
            if(path[b]==-1)
                path[b]=b;            
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(tt[i]==1)
                ans++;
        }
        System.out.println(ans);
        for(int i=0;i<n;i++){
            if(tt[i]==1){
                int mind=Integer.MAX_VALUE;
                int start=i;
                int end=path[start];
                while(start!=end){
                    mind=Math.min(mind,d[start][end]);
                    start=end;
                    end=path[start];
                }
                System.out.println((i+1) + " " + (end+1) + " " + mind);
            }
        }

        // can do with dfs
        // by creating a graph of list of list
        // can check tutorial here -> https://codeforces.com/blog/entry/2514
    }
}

