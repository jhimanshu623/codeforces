import java.io.*;
import java.util.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void solve(String[] arr) {
        int w = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                char ch = arr[i].charAt(j);
                switch (ch) {
                case 'Q':
                    w += 9;
                    break;
                case 'R':
                    w += 5;
                    break;
                case 'B':
                    w += 3;
                    break;
                case 'N':
                    w += 3;
                    break;
                case 'P':
                    w += 1;
                    break;
                case 'q':
                    b += 9;
                    break;
                case 'r':
                    b += 5;
                    break;
                case 'b':
                    b += 3;
                    break;
                case 'n':
                    b += 3;
                    break;
                case 'p':
                    b += 1;
                    break;
                }
            }
        }
        if(w>b){
            System.out.println("White");
        }else if(b>w){
            System.out.println("Black");
        }else{
            System.out.println("Draw");
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.next();
        }
        solve(arr);
    }
}
