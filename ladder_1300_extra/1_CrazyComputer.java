import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int a=-1;
        int b=-1;
        int ans=0;
        while(n-- > 0)
        {
            b=sc.nextInt();
            if(a==-1)
                a=b;
            if(b-a<=c)
                ans++;
            else
                ans=1;
            a=b;
        }
        System.out.println(ans);
    }
}