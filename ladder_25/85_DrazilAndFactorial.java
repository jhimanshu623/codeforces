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
    public static void solve(int n,String arr){
        ArrayList<Integer>[] map=new ArrayList[10];
        map[2]=new ArrayList<>(Arrays.asList(2));
        map[3]=new ArrayList<>(Arrays.asList(3));
        map[4]=new ArrayList<>(Arrays.asList(2,2,3));
        map[5]=new ArrayList<>(Arrays.asList(5));
        map[6]=new ArrayList<>(Arrays.asList(3,5));
        map[7]=new ArrayList<>(Arrays.asList(7));
        map[8]=new ArrayList<>(Arrays.asList(2,2,2,7));
        map[9]=new ArrayList<>(Arrays.asList(2,3,3,7));
        int[] ans=new int[10];
        for(int i=0;i<n;i++){
            int num=arr.charAt(i)-'0';
            if(num!=0 && num!=1){
                for(int j=0;j<map[num].size();j++){
                    ans[map[num].get(j)]++;
                }
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=9;i>=2;i--){
            for(int j=0;j<ans[i];j++){
                res.append(i);
            }
        }
        System.out.println(res.toString());
    }
    // tutorial -> https://codeforces.com/blog/entry/16468
    // other implementation -> https://codeforces.com/contest/515/submission/72378023
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        String arr=sc.next();
        solve(n,arr);
    }
}