import java.util.*;
public class Main
{
    public static int solve(int n,int m,int r,int c)
    {
        return Math.max(Math.abs(r-1),Math.abs(n-r))+Math.max(Math.abs(c-1),Math.abs(m-c));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int r=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(solve(n,m,r,c));    
        }
        
    }
}