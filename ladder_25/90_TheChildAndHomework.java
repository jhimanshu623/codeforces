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
    static class Pair implements Comparable<Pair>{
        char ch;
        int len;
        Pair(char ch,int len){
            this.ch=ch;
            this.len=len;
        }
        public int compareTo(Pair o){
            return this.len-o.len;
        }
    }
    public static void solve(Pair[] arr){
        Arrays.sort(arr);
        if(arr[0].len <= arr[1].len/2 && arr[3].len < arr[2].len*2){
            System.out.println(arr[0].ch);
        }else if(arr[3].len >= arr[2].len*2 && arr[0].len > arr[1].len/2){
            System.out.println(arr[3].ch);
        }else{
            System.out.println('C');
        }
    }
    // tutorial -> https://codeforces.com/blog/entry/12513
    // other solution -> https://codeforces.com/contest/437/submission/102871957
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        Pair[] arr=new Pair[4];
        arr[0]=new Pair('A',sc.next().length()-2);
        arr[1]=new Pair('B',sc.next().length()-2);
        arr[2]=new Pair('C',sc.next().length()-2);
        arr[3]=new Pair('D',sc.next().length()-2);
        solve(arr);
    }
}