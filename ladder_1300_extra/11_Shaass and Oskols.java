import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int m=sc.nextInt();
        while(m-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x<n)
                arr[x]+=arr[x-1]-y;
            if(x-2>=0)
                arr[x-2]+=y-1;
            arr[x-1]=0;
        }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}