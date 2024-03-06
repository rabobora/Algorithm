import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 참가신청 횟수
        String game = st.nextToken(); // 진행할 게임

        HashSet<String> set = new HashSet<>();

        for(int i=0;i<N;i++){
            set.add(br.readLine());
        }

        int play = 0;
        if (game.equals("Y")) {
            play = 1;
        }else if(game.equals("F")){
            play = 2;
        }else{
            play = 3;
        }

        int result = set.size()/play;

        bw.write(String.valueOf(result));

        bw.close();
        br.close();
    } // main
} // class