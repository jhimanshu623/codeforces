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
    public static void solve(int n){
        int count=0;
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] arr=new boolean[n+1];
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i<=n;i++){
            if(arr[i]==false){
                for(int j=2;i*j<=n;j++){
                    arr[i*j]=true;
                }
                for(int j=i;j<=n;j*=i){
                    count++;
                    ans.add(j);
                }
            }
        }
        System.out.println(count);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
    // check this link -> https://github.com/MathProgrammer/CodeForces/blob/master/Explanations/Explanations%20-%204/Vasya%20and%20Petya's%20Game%20-%20Explanation.txt
    // check tutoril  -> https://codeforces.com/blog/entry/20226
    // notes page 5
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        solve(n);
    }
}

