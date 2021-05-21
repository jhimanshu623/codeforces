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
    public static void solve(int[] arr){
        int[] freq=new int[10];
        int count=0,a=0,b=0,c=0;
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
            if(freq[arr[i]]==1){
                count++;
                if(a==0){
                    a=arr[i];
                }else if(b==0){
                    b=arr[i];
                }else if(c==0){
                    c=arr[i];
                }
            }
        }
        if(count>3){
            System.out.println("Alien");
        }else{
            if(count==1){
                System.out.println("Elephant");
            }else if(count==2){
                if((freq[a]==4 && freq[b]==2) || (freq[a]==2 && freq[b]==4)){
                    System.out.println("Elephant");
                }else if((freq[a]==5 && freq[b]==1) || (freq[a]==1 && freq[b]==5)){
                    System.out.println("Bear");
                }else{
                    System.out.println("Alien");
                }
            }else if(count==3){
                if(freq[a]==4 || freq[b]==4 || freq[c]==4){
                    System.out.println("Bear");
                }else{
                    System.out.println("Alien");
                }
            }
        }
    }
    // check the tutorial here -> https://codeforces.com/blog/entry/13986
    // good solutions -> https://codeforces.com/contest/471/submission/86481766
    //                   https://codeforces.com/contest/471/submission/106107927
    //                   https://codeforces.com/contest/471/submission/102083271

    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int[] arr=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        solve(arr);
    }
}

