import java.util.*;

public class Main
{
    public static int solve(int n,int[] arr)
    {
        int res=0;
        for(int i=n-1;i>=0;i--)
        {
            if(i+arr[i]<n)
                arr[i]+=arr[i+arr[i]];
            res=Math.max(res,arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            System.out.println(solve(n,arr));
        }
    }
}

