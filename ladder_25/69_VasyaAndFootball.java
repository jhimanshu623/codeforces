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

    public static void main(String[] args) {
        FastReader sc=new FastReader(); 
        
        String teams[]=new String[2];
        teams[0]=sc.next();
        teams[1]=sc.next();
        int n=sc.nextInt();
        int[] hteam=new int[100];
        int[] ateam=new int[100];
        for(int i=0;i<n;i++){
            int time=sc.nextInt();
            char team=sc.next().charAt(0);
            int player=sc.nextInt();
            char card=sc.next().charAt(0);
            
            if(team=='h'){
                if(hteam[player]!=-1){
                    if(card=='y'){
                        if(hteam[player]==1){
                            hteam[player]=-1;
                            System.out.println(teams[0]+" "+player+" "+time);
                        }else{
                            hteam[player]++;
                        }
                    }else{
                        hteam[player]=-1;
                        System.out.println(teams[0]+" "+player+" "+time);
                    }
                }
            }else{
                if(ateam[player]!=-1){
                    if(card=='y'){
                        if(ateam[player]==1){
                            ateam[player]=-1;
                            System.out.println(teams[1]+" "+player+" "+time);
                        }else{
                            ateam[player]++;
                        }
                    }else{
                        ateam[player]=-1;
                        System.out.println(teams[1]+" "+player+" "+time);
                    }
                }
            }

        }
    }
}
