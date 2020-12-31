import java.util.*;

class Main
{
    static int a1,a2,a3,a4;
    public static int solve(int r1,int r2,int c1,int c2,int d1,int d2)
    {
        if(r1+r2 != c1+c2 && r1+r2!=d1+d2)
            return -1;
        if((r1+d1-c2)%2!=0)
            return -1;
        a1=(r1+d1-c2)/2;
        a2=r1-a1;
        a3=c1-a1;
        a4=d1-a1;
        
        if(a1==a2 || a1==a3 || a1==a4 || a2==a3 || a2==a4 || a3==a4)
            return -1;
        if(a1<1 || a1>9)
            return -1;
        if(a2<1 || a2>9)
            return -1;
        if(a3<1 || a3>9)
            return -1;
        if(a4<1 || a4>9)
            return -1;
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        int res=solve(r1, r2, c1, c2, d1, d2);
        if(res==-1)
            System.out.println(-1);
        else
        {
            System.out.println(a1+" "+a2);
            System.out.println(a3+" "+a4);
        }
    }
}

