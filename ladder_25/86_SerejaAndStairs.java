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
    public static void solve(int n,int[] arr){
        Arrays.sort(arr);
        int ans=1;
        ArrayList<Integer> res=new ArrayList<>();
        res.add(arr[0]);
        arr[0]=-1;
        for(int i=1;i<n;i++){
            if(arr[i]!=(res.get(ans-1))){
                res.add(arr[i]);
                arr[i]=-1;
                ans++;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=-1 && arr[i]!=(res.get(ans-1))){
                res.add(arr[i]);
                ans++;
            }
        }
        System.out.println(ans);
        for(int i=0;i<ans;i++){
            System.out.print(res.get(i)+" ");
        }
        System.out.println();
    }
    // tutorial -> https://codeforces.com/blog/entry/10363
    // other way -> https://codeforces.com/contest/381/submission/94882600
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int m=sc.nextInt();
        int[] arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        solve(m,arr);
    }
}