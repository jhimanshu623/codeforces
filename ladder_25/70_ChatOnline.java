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
    public static void solve(int p,int q,int l,int r,int[][] arr1,int[][] arr2){
        int ans=0;
        for(int t=l;t<=r;t++){
            int i=0,j=0;
            while(i<p && j<q){
                if(arr2[j][1]+t < arr1[i][0]){
                    j++;
                }else if(arr2[j][0]+t > arr1[i][1]){
                    i++;
                }else{
                    j++;
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
    // This problem is not hard. Just iterator over all possible t,
    //  and check if the schedule of Little X and Little Z will overlap.

    // check other solutions -> https://codeforces.com/contest/469/status/B?order=BY_CONSUMED_TIME_ASC  
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int p=sc.nextInt();
        int q=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int[][] arr1=new int[p][2];
        int[][] arr2=new int[q][2];
        for(int i=0;i<p;i++){
            arr1[i][0]=sc.nextInt();
            arr1[i][1]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            arr2[i][0]=sc.nextInt();
            arr2[i][1]=sc.nextInt();
        }
        solve(p,q,l,r,arr1,arr2);
    }
}

