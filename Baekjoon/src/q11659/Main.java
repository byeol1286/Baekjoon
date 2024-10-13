package q11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//BufferedReader
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = 
                new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer stringTokenizer = 
                new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());  // N
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());  // M

        long[] S = new long[suNo + 1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            long sum = S[j] - S[i - 1];

            sb.append(sum).append("\n");
        }

        System.out.print(sb.toString());

        bufferedReader.close();
    }
}
