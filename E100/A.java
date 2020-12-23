import java.util.*;

public class Main
{
    public static boolean solve(int a,int b,int c)
    {
        int sum=a+b+c;
        if(sum%9 != 0)
            return false;
        int rounds=sum/9;
        if(a<rounds || b<rounds || c<rounds)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            boolean res=solve(a,b,c);
            if(res)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}


// testcases

// 20 20 12
// 18 9 9