package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BeakJoon_No_1946 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            ArrayList<score> list = new ArrayList<>();
            for(int j=0;j<N;j++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                list.add(new score(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            }
            Collections.sort(list, (o1, o2) -> {
                return o1.interview-o2.interview;
            });
            int interviewScore = list.get(0).interview;
            int examScore = list.get(0).exam;
            for(int j=1;j<list.size();j++){
                score s = list.get(j);
                if(s.exam < examScore){
                    interviewScore++;
                    examScore = s.exam;
                }
            }
            System.out.println(interviewScore);
        }

    }
    private static class score{
        int interview;
        int exam;

        public score(int interview, int exam) {
            this.interview = interview;
            this.exam = exam;
        }
    }
}
