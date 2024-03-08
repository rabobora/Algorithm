import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0 && C == 0) {
                break;
            }

            // 피타고라스 정리이용
            if (A * A + B * B == C * C) {
                sb.append("right").append("\n");
            } else if (A * A + C * C == B * B) {
                sb.append("right").append("\n");
            } else if (B * B + C * C == A * A) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }

        }

        System.out.println(sb);

        br.close();
    } // main
} // class