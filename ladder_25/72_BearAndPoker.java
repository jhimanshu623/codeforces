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
    public static long gcd(long a,long b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static boolean isPower(long n,int b){
        Double logb;
        if(b==2){
            logb=(Math.log(n) / Math.log(2));
        }else {
            logb=(Math.log(n) / Math.log(3));
        }
        if(Math.ceil(logb) == Math.floor(logb))
            return true;
        return false;
    }
    
    // *********************  giving lcm out of long range  **************
    // public static void solve(int n,int[] arr){
    //     long lcm=arr[0]*arr[1]/gcd(arr[0],arr[1]);
    //     for(int i=2;i<n;i++){
    //         lcm=arr[i]*lcm/gcd(lcm,arr[i]);
    //     }
    //     System.out.println(lcm);
    //     for(int i=0;i<n;i++){
    //         long q=lcm/arr[i];
    //         if(!(q==1 || isPower(q,2) || isPower(q,3))){
    //             System.out.println("No");
    //             return;
    //         }
    //     }
    //     System.out.println("Yes");
    // }


    // *********************  giving lcm out of long range  **************
    // public static void solve(int n,int[] arr){
    //     for(int i=0;i<n-1;i++){
    //         long lcm=arr[i]*arr[i+1]/gcd(arr[i],arr[i+1]);
    //         long q1=lcm/arr[i];
    //         long q2=lcm/arr[i+1];
    //         if( ((q1==1 || isPower(q1,2) || isPower(q1,3)) &&
    //          (q2==1 || isPower(q2,2) || isPower(q2,3))) == false){
    //             System.out.println("No");
    //             return;
    //         }
    //     }
    //     System.out.println("Yes");
    // }

    public static void solve(int n,int[] arr){
        for(int i=0;i<n;i++){
            while(arr[i]%2==0){
                arr[i]/=2;
            }
            while(arr[i]%3==0){
                arr[i]/=3;
            }
            if(i>0 && arr[i]!=arr[i-1]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    // check tutorial here -> https://codeforces.com/blog/entry/20040
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        solve(n,arr);
    }
}

