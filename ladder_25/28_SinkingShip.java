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
    public static void solve(int n,String[] arr){
        String captain=null;
        List<String> wc=new ArrayList<>();
        List<String> rats=new ArrayList<>();
        List<String> man=new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] ns=arr[i].split(" ");
            if(ns[1].equals("rat")){
                rats.add(ns[0]);
            }else if(ns[1].equals("woman") || ns[1].equals("child")){
                wc.add(ns[0]);
            }else if(ns[1].equals("man")){
                man.add(ns[0]);
            }else{
                captain=ns[0];
            }
        }
        for(int i=0;i<rats.size();i++){
            System.out.println(rats.get(i));
        }
        for(int i=0;i<wc.size();i++){
            System.out.println(wc.get(i));
        }
        for(int i=0;i<man.size();i++){
            System.out.println(man.get(i));
        }
        System.out.println(captain);
    }
    // print four times , check tutorial here -> https://codeforces.com/blog/entry/1385
    // using sorting , check tutorial 2 here -> https://codeforces.com/blog/entry/1384

    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        solve(n,arr);
    }
}

