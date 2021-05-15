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
    private static class Location implements Comparable<Location>
    {
        int x;
        int y;
        int p;
        Location(int x,int y,int p){
            this.x=x;
            this.y=y;
            this.p=p;
        }
        @Override
        public int compareTo(Location other){
            return (this.x*this.x+this.y*this.y) - (other.x*other.x+other.y*other.y);
        }
    }
    public static void solve(int n,int tp,Location[] arr){
        int rp=1000000 - tp;
        int i=0;
        
        Arrays.sort(arr);
        while(rp>0 && i<n){
            rp-=arr[i].p;
            i++;
        }
        if(rp>0){
            System.out.println(-1);
            return;
        }
        double radius= Math.sqrt(arr[i-1].x * arr[i-1].x + arr[i-1].y * arr[i-1].y);
        System.out.println(radius);
    }

    // binary search
    public static void solve2(int n,int tp,Location[] arr){
        int rp=1000000 - tp;
        Arrays.sort(arr);
        int[] preSum=new int[n];
        preSum[0]=arr[0].p;
        for(int i=1;i<n;i++){
            preSum[i]=preSum[i-1]+arr[i].p;
        }
        int l=0,r=n;
        while(l<r){
            int mid=(l+r)/2;
            if(rp <= preSum[mid]){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        if(l==n){
            System.out.println(-1);
        }else{
            double radius= Math.sqrt(arr[r].x * arr[r].x + arr[r].y * arr[r].y);
            System.out.println(radius);
        }
    }

    // check binaary search solution here -> https://codeforces.com/contest/424/submission/102085955
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        int n=sc.nextInt();
        int tp=sc.nextInt();
        Location[] arr=new Location[n];
        for(int i=0;i<n;i++){
            arr[i]=new Location(sc.nextInt(),sc.nextInt(),sc.nextInt());            
        }
        // solve(n,tp,arr);
        solve2(n,tp,arr);
    }
}

