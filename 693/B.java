import java.util.*;

public class Main
{    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int no=0;
            int nt=0;
            for(int i=0;i<n;i++)
            {
                int val=sc.nextInt();
                if(val==1)
                    no++;
                else
                    nt++;
            }
            if(no%2==0)
            {
                if(nt%2==0)
                    System.out.println("YES");
                else
                {
                    if(no>0)
                        System.out.println("YES");
                    else    
                        System.out.println("NO");
                }
            }
            else
                System.out.println("NO");
        }

    }
}

