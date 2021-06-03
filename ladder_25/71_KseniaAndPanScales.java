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
    public static void solve(String str,String ew){
        int lwl=0,rwl=0,ewl=ew.length();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='|'){
                lwl=i;
                rwl=str.length()-(i+1);
                break;
            }
        }
        StringBuilder left=new StringBuilder(str.substring(0, lwl));
        StringBuilder right=new StringBuilder(str.substring(lwl+1));
        if(lwl == rwl){
            if(ewl%2==0){
                int mid=ewl/2;
                for(int i=0;i<mid;i++){
                    left.append(ew.charAt(i));
                }
                for(int i=mid;i<ewl;i++){
                    right.append(ew.charAt(i));
                }
            }else{
                System.out.println("Impossible");
                return;
            }
        }else if(lwl > rwl){
            int diff=lwl-rwl;
            if(ewl >= diff){
                for(int i=0;i<diff;i++){
                    right.append(ew.charAt(i));
                }
                if((ewl-diff)%2==0){
                    int mid=(ewl-diff)/2;
                    for(int i=diff;i<mid+diff;i++){
                        left.append(ew.charAt(i));
                    }
                    for(int i=diff+mid;i<ewl;i++){
                        right.append(ew.charAt(i));
                    }
                }else{
                    System.out.println("Impossible");
                    return;
                }
            }else{
                System.out.println("Impossible");
                return;
            }
        }else{
            int diff=rwl-lwl;
            if(ewl >= diff){
                for(int i=0;i<diff;i++){
                    left.append(ew.charAt(i));
                }
                if((ewl-diff)%2==0){
                    int mid=(ewl-diff)/2;
                    for(int i=diff;i<mid+diff;i++){
                        left.append(ew.charAt(i));
                    }
                    for(int i=diff+mid;i<ewl;i++){
                        right.append(ew.charAt(i));
                    }
                }else{
                    System.out.println("Impossible");
                    return;
                }
            }else{
                System.out.println("Impossible");
                return;
            }
        }
        left.append("|").append(right);
        System.out.println(left);
    }
    // check tutorial here -> https://codeforces.com/blog/entry/10442
    // check this solution -> https://codeforces.com/contest/382/submission/97505926
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        String str=sc.next();
        String ew=sc.next();
        solve(str,ew);
    }
}

