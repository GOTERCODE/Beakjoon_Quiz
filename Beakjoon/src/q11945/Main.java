package q11945;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char arr[][] = new char[n][m];
        String stArr[] = new String[n];

        for (int i = 0; i < n; i++) {
            stArr[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = stArr[i].charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        br.close();
    }
}
