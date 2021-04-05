import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[3];
        while(n-- > 0)
        {
            arr[0]+=sc.nextInt();
            arr[1]+=sc.nextInt();
            arr[2]+=sc.nextInt();
        }
        if(arr[0]==0 && arr[1]==0 && arr[2]==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}