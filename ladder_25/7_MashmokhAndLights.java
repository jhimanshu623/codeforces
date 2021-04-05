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
    public static void solve(int n,int m,int[] buttons){
        int[] bulbs=new int[n];
        int rm=n;
        for(int i=0;i<m;i++)
        {
            int button=buttons[i];
            int bidx=button-1;
            if(bidx<rm){
                bulbs[bidx]=button;
                rm=bidx;
            }
        }
        for(int i=1;i<n;i++)
        {
            if(bulbs[i]==0){
                bulbs[i]=bulbs[i-1];
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(bulbs[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] buttons=new int[m];
        for(int i=0;i<m;i++)
            buttons[i]=sc.nextInt();
        solve(n,m,buttons);
    }
}

