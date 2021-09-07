package BaekJoon;
import java.util.*;
public class BeakJoon_No_10773 {
    Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        BeakJoon_No_10773 go = new BeakJoon_No_10773();
        go.send();
    }

    public void send(){
        ArrayList<Integer> list = new ArrayList<>();
        int K = scan.nextInt();
        int answer = 0;
        Stack<Integer> s = new Stack<Integer>();
        for (int i=0;i<K;i++){
            int pushNum = scan.nextInt();
            if(pushNum == 0 && s.empty())i--;
            if(pushNum != 0)s.push(pushNum);
            if(pushNum == 0 && !s.empty())s.pop();
        }
        while (!s.empty()){
            answer += s.pop();
        }
        System.out.println(answer);
    }
}

