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
    public static void solve(int n,int[][] arr){
        HashMap<Integer,Integer> xMap=new HashMap<>();
        HashMap<Integer,Integer> yMap=new HashMap<>();
        HashMap<Integer,HashMap<Integer,Integer>> bothMap=new HashMap<>();
        long ans=0;
        for(int i=0;i<n;i++){
            int x=arr[i][0];
            int y=arr[i][1];
            ans+=xMap.getOrDefault(x, 0)+yMap.getOrDefault(y, 0);
            if(bothMap.get(x)!=null){
                ans-=bothMap.get(x).getOrDefault(y, 0);
            }else{
                bothMap.put(x, new HashMap<>());
            }
            bothMap.get(x).put(y, bothMap.get(x).getOrDefault(y, 0)+1);
            xMap.put(x, xMap.getOrDefault(x, 0)+1);
            yMap.put(y, yMap.getOrDefault(y, 0)+1);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        solve(n,arr);
    }
}

