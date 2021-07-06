import java.io.*;
import java.lang.reflect.Array;
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
    // ***************** memory limit excedded, need to apply dp *************
    // public static boolean solve(int s,int d,boolean[] dirty){
    //     if(s==d){
    //         return true;
    //     }
    //     for(int step=1;step<=3 && s+step<=d;step++){
    //         boolean res=false;
    //         if(dirty[s+step]==false)
    //             res=solve(s+step,d,dirty);
    //         if(res)
    //             return true;
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     FastReader sc=new FastReader(); 
        
    //     int d=sc.nextInt();
    //     int n=sc.nextInt();
    //     boolean[] dirty=new boolean[d+1];
    //     for(int i=0;i<n;i++){
    //         int ds=sc.nextInt();
    //         dirty[ds]=true;
    //     }
    //     boolean ans=false;
    //     if(dirty[1]==false && dirty[d]==false){
    //         ans=solve(1,d,dirty);
    //     }
    //     System.out.println(ans?"YES":"NO");
    // }


    // ************* dp solution, memory limit exceed *************
    // public static boolean solve(int d,boolean[] dirty){

    //     for(int s=d-1;s>=1;s--){
    //         if(dirty[s]==true){
    //             boolean res=false;
    //             for(int step=1;step<=3 && s+step<=d;step++){
    //                 if(dirty[s+step]==true){
    //                     res=true;
    //                     break;
    //                 }
    //             }
    //             dirty[s]=res;
    //         }
    //     }
    //     return dirty[1];
    // }
    // public static void main(String[] args) {
    //     FastReader sc=new FastReader(); 
        
    //     int d=sc.nextInt();
    //     int n=sc.nextInt();
    //     boolean[] dirty=new boolean[d+1];
    //     Arrays.fill(dirty, true);
    //     for(int i=0;i<n;i++){
    //         int s=sc.nextInt();
    //         dirty[s]=false;
    //     }
    //     boolean ans=false;
    //     if(dirty[1]==true && dirty[d]==true){
    //         ans=solve(d,dirty);
    //     }
    //     System.out.println(ans?"YES":"NO");
    // }

    public static boolean solve(int d,int[] arr){
        for(int i=0;i<arr.length-2;i++){
            if(arr[i+1]==arr[i]+1 && arr[i+2]==arr[i]+2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int d=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        boolean ans=false;
        if(n==0){
            ans=true;
        }
        else if(arr[0]!=1 && arr[n-1]!=d){
            ans=solve(d,arr);
        }
        System.out.println(ans?"YES":"NO");
    }
}