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
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int v=sc.nextInt();
        int count=0;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            boolean isFound=false;
            for(int j=0;j<k;j++){
                int p=sc.nextInt();
                if(p<v && isFound==false){
                    count++;
                    res.add(i+1);
                    isFound=true;
                }
            }
        }
        System.out.println(count);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
}

