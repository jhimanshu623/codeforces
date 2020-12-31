import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] points={ 500, 1000, 1500, 2000, 2500};
        int[] st=new int[5];     // submission time
        int[] nows=new int[5];  // no. of wrong submissions
        int sh=0,ush=0;         // succ. hacks and unsucc. hacks
        for(int i=0;i<5;i++)
            st[i]=sc.nextInt();
        for(int i=0;i<5;i++)
            nows[i]=sc.nextInt();
        sh=sc.nextInt();
        ush=sc.nextInt();

        double ts=0; //total score
        for(int i=0;i<5;i++)
        {
            double s=(0.3*points[i]);
            s=Math.max(s ,((1-st[i]*1.0/250)*points[i]) - 50*nows[i]);
            ts+=s;
        }
        ts+=(100*sh) - (50*ush);
        System.out.println((int)ts);
    }
}