package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] col = new int[N];
        int[] row = new int[M];
        int colcnt = 0;
        int rowcnt = 0;
        for(int i = 0 ; i<N ; i++){
            char[] ex = br.readLine().toCharArray();
            for(int j=0 ; j<M ; j++){
                if(ex[j] == 'X') {col[i]++; row[j]++;}
            }
        }
        for(int i = 0 ; i<N ; i++){
            if(col[i]==0) colcnt++;
        }
        for(int i = 0 ; i<M ; i++){
            if(row[i]==0) rowcnt++;
        }

        System.out.println(Math.max(colcnt, rowcnt));

    }
}
