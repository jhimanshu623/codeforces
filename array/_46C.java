import java.util.Scanner;

public class _46C
{
    public static int minSwaps(int[] arr)
    {
        int x=0;
        for(int val:arr)
        {
            if(val==1)
                x++;
        }
        int j=0,i=0,count=0,max_count=0;
        while(i<x)
        {
            if(arr[i]==1)
                count++;
            i++;
        }

        max_count=count;
        while(j<arr.length)
        {
            if(arr[i]==1)
                count++;
            if(arr[j]==1)
                count--;
            max_count=Math.max(max_count,count);
            i=(i+1)%arr.length;
            j++;
        }
        return x-max_count;
    }
    public static int solve(String str,int n)
    {
        int[] arr=new int[n];
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='H')
                arr[i]=0;
            else
                arr[i]=1;
        }
        return minSwaps(arr);
    }
    public static void main(String[] args) {
        // int[] arr={0,1,0,1,0,1,0,0,1};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        System.out.println(solve(str,n));
    }
}