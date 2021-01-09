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
    public static int solve(HashSet<Integer>[] g)
    {
        int n=g.length;
        int ans=0;
        while(true)
        {
            boolean isFound=false;
            int[] conn=new int[n];
            for(int i=1;i<n;i++)
            {
                if(g[i]!=null && g[i].size()==1 && conn[i]==0)
                {
                    isFound=true;
                    int nbr=g[i].iterator().next();
                    g[i].remove(nbr);
                    g[nbr].remove(i);
                    conn[nbr]=g[nbr].size();
                }
            }
            if(isFound==false)
                break;
            else
                ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        HashSet<Integer>[] g=new HashSet[n+1];
        for(int i=0;i<m;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(g[a]==null)
                g[a]=new HashSet<Integer>();
            if(g[b]==null)
                g[b]=new HashSet<Integer>();
            g[a].add(b);
            g[b].add(a);
        }
        System.out.println(solve(g));
    }
}