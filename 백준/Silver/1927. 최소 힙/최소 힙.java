import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 연산의 개수

        // 낮은 숫자가 우선 순위인 큐
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
        int X = Integer.parseInt(br.readLine()); // 연산의 정보
            if(X==0){
                if(queue.isEmpty()){
                    sb.append(0).append("\n");
                }else{
                    int x = queue.poll();
                    sb.append(x).append("\n");
                }
            }else{
                queue.add(X);
            }
        }

        System.out.println(sb);

        br.close();

    } // main
} // class