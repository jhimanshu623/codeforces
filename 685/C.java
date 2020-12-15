import java.io.*;
import java.util.*;
class Main {
	public static boolean solve(String a,String b,int n,int k)
    {
        int[] fmap1=new int[26];
        int[] fmap2=new int[26];
        for(int i=0;i<a.length();i++)
            fmap1[a.charAt(i)-'a']++;
        for(int i=0;i<b.length();i++)
            fmap2[b.charAt(i)-'a']++;
        for(int i=0;i<26;i++)
        {
            if(fmap1[i]<fmap2[i])
                return false;
            fmap1[i]-=fmap2[i];
            if(fmap1[i]%k!=0 || (i==25 && fmap1[i]>0))
                return false;
            if(i<=24)
                fmap1[i+1]+=fmap1[i];
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            System.out.println(solve(a,b,n,k)?"Yes":"No");
        }
    }
}