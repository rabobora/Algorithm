import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int max = Math.max(Math.max(a, b), c);

            if (a + b + c - max == max || a + b + c - max < max) {
                sb.append("Invalid").append("\n");
            } else if (a == b && b == c && c == a) {
                sb.append("Equilateral").append("\n");
            } else if (a != b && b != c && c != a) {
                sb.append("Scalene").append("\n");
            } else {
                sb.append("Isosceles").append("\n");
            }
        }

        System.out.println(sb);

        br.close();

    } // main
} // class