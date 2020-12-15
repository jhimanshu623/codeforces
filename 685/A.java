import java.io.*;
import java.util.*;
class Main {
	public static int solve(int n)
    {
        if(n<=3)
            return n-1;
        if(n%2==0)
            return 2;
        return 3;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0)
        {
            int n=sc.nextInt();
            System.out.println(solve(n));
        }
    }
}

// good testcase
// n=25