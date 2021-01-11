import java.util.*;

public class Main
{
    public static long solve(int n,int m,int[] arr1,int[] arr2)
    {
        long res=0;
        Arrays.sort(arr1);
        int gidx=0;
        for(int i=n-1;i>=0;i--)
        {
            int k=arr1[i]-1;
            if(gidx<=k)
            {
                res+=arr2[gidx];
                gidx++;
            }
            else
                res+=arr2[k];
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[m];
            for(int i=0;i<n;i++)
                arr1[i]=sc.nextInt();
            for(int i=0;i<m;i++)
                arr2[i]=sc.nextInt();
            System.out.println(solve(n,m,arr1,arr2));
        }

    }
}

