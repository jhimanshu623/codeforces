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
    
    // solutions
        // 1) Maths/greedy
        // 2) Xor
        // 3) map
        // 4) sorting
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        

        // **************** best solution ***********88
        int n=sc.nextInt();
        long osum=0,fsum=0,ssum=0;
        for(int i=0;i<n;i++){
            osum+=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            fsum+=sc.nextInt();
        }
        for(int i=0;i<n-2;i++){
            ssum+=sc.nextInt();
        }
        System.out.println(osum-fsum);
        System.out.println(fsum-ssum);


        // ************ using xor *************
        // int n=sc.nextInt();
        // int[] arr1=new int[n];
        // int[] arr2=new int[n];
        // int[] arr3=new int[n];
        // for(int i=0;i<n;i++){
        //     arr1[i]=sc.nextInt();
        // }
        // for(int i=0;i<n-1;i++){
        //     arr2[i]=sc.nextInt();
        // }
        // for(int i=0;i<n-2;i++){
        //     arr3[i]=sc.nextInt();
        // }
        // int ans1=arr1[0];
        // for(int i=1;i<n;i++){
        //     ans1^=arr1[i];
        // }
        // for(int i=0;i<n-1;i++){
        //     ans1^=arr2[i];
        // }
        // int ans2=arr2[0];
        // for(int i=1;i<n-1;i++){
        //     ans2^=arr2[i];
        // }
        // for(int i=0;i<n-2;i++){
        //     ans2^=arr3[i];
        // }
        // System.out.println(ans1);
        // System.out.println(ans2);
    }
}