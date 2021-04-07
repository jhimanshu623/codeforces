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

    public static void solve(String str,int idx,String ans,HashSet<String> allPalindromes){
        if(idx==str.length())
        {
            if(ans.length()!=0 && isPalindrome(ans))
                allPalindromes.add(ans);
            return;
        }
        solve(str,idx+1,ans,allPalindromes);
        solve(str,idx+1,ans+str.charAt(idx),allPalindromes);
    }
    public static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
    public static void solve1(String str){
        HashSet<String> allPalindromes=new HashSet<>();
        
        solve(str,0,"",allPalindromes);

        ArrayList<String> palindromes=new ArrayList(allPalindromes);
        Collections.sort(palindromes,Collections.reverseOrder());
        System.out.println(palindromes.get(0));
    }
    public static void solve2(String str){
        char hch=str.charAt(0);
        int hcf=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)>hch){
                hch=str.charAt(i);
                hcf=1;
            }
            else if(str.charAt(i)==hch){
                hcf++;
            }
        }
        for(int i=0;i<hcf;i++)
            System.out.print(hch);
        System.out.println();
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        String str=sc.next();
        // solve1(str);
        solve2(str);
    }
}

