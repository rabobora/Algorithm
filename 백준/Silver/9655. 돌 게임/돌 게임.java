import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 돌의 개수

        // 홀수면 상근이가 이기고 짝수면 창영이가 이기게 됨
        if(N%2==0){
            bw.write("CY");
        }else {
            bw.write("SK");
        }

        bw.close();
        br.close();
    } // main
} // class