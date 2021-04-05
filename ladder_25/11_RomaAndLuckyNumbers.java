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
    public static void solve(int n,int k,int[] arr){
        int ans=0;
        for(int i=0;i<n;i++){
            int num=arr[i];
            int count=0;
            while(num>0){
                int d=num%10;
                num/=10;
                if(d==4 || d==7){
                    count++;
                    if(count>k)
                        break;
                }
            }
            if(count<=k)
                ans++;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        solve(n,k,arr);
    }
}

