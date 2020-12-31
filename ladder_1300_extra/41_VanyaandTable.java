import java.util.*;

// O(n2)

// public class Main
// {
//     static int[][] mat=new int[101][101];
//     public static void solveQuery(int r1,int c1,int r2,int c2)
//     {
//         for(int i=r1;i<=r2;i++)
//         {
//             mat[i][c1]+=1;
//             if(c2+1<101)
//                 mat[i][c2+1]-=1;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         while(n-->0)
//         {
//             int r1=sc.nextInt();
//             int c1=sc.nextInt();
//             int r2=sc.nextInt();
//             int c2=sc.nextInt();
//             solveQuery(r1, c1, r2, c2);
//         }

//         // take prefix sum row wise
//         int ans=0;
//         for(int i=1;i<=100;i++)
//         {
//             for(int j=1;j<=100;j++)
//             {
//                 mat[i][j]+=mat[i][j-1];
//                 ans+=mat[i][j];
//             }
//         }
//         System.out.println(ans);
//     }
// }

// O(n)

class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n-->0)
        {
            int r1=sc.nextInt();
            int c1=sc.nextInt();
            int r2=sc.nextInt();
            int c2=sc.nextInt();
            ans+=(r2-r1+1)*(c2-c1+1);
        }
        System.out.println(ans);
    }
}

