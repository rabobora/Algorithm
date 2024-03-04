import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine(); // 초기 문자열
        String T = br.readLine(); // 만들어야 하는 문자열

        StringBuilder sb = new StringBuilder();


        // T -> S로 만들 수 있는지 없는지 판단
        sb.append(T);

        while (S.length() < sb.length()) {
            // 마지막 문자가 A일 경우 A제거
            if (sb.charAt(sb.length() - 1) == 'A') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                // 마지막 문자가 B일 경우, B 제거 후 뒤집기
                sb.deleteCharAt(sb.length() - 1);
                sb.reverse();
            }
        }

        // 가능하면 1, 불가능하면 0
        if (sb.toString().equals(S)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        br.close();
    } // main
} // class