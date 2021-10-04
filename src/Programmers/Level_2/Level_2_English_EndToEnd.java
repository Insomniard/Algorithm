package Programmers.Level_2;
import java.util.*;
public class Level_2_English_EndToEnd {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int answer[] = solution(n, words);
        for(int i=0;i< answer.length;i++)System.out.print(answer[i] + " ");

    }
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Boolean[] visit = new Boolean[words.length];
        HashSet<String> set = new HashSet<String>();
        set.add(words[0]);
        char end = words[0].charAt(words[0].length()-1);
        for(int i=0;i<visit.length;i++)visit[i] = false;
        for(int i=1;i<words.length;i++){
            set.add(words[i]);
            char start = words[i].charAt(0);
            if(set.size() != i+1 || start != end)
            {
                visit[i] = true;
                break;
            }
            end = words[i].charAt(words[i].length()-1);
        }
        for(int i=0;i<visit.length;i++){
            if(visit[i] == true){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
            }
        }
        return answer;
    }
}
