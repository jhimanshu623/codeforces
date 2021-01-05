import java.util.*;

public class Main
{
    public static int powerOfTwo(int num)
    {
        if(num%2!=0)
            return 1;
        int ans=1;
        while(num>1 && num%2==0)
        {
            num=num/2;
            ans*=2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int w=sc.nextInt();
            int h=sc.nextInt();
            int n=sc.nextInt();
            int tc=powerOfTwo(w)*powerOfTwo(h);
            System.out.println((tc>=n)?"YES":"NO");
        }

    }
}

