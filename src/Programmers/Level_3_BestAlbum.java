package Programmers;
import java.util.*;
public class Level_3_BestAlbum {
    public static void main(String args[]){
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> playtime = new HashMap<String, Integer>(); // 장르 / 플레이타임
        ArrayList<Integer> answers = new ArrayList<>();
        for(int i = 0; i < genres.length; i++) {
            playtime.put(genres[i], playtime.getOrDefault(genres[i], 0) + plays[i]);
            map.put(i, genres[i]);
        }
        ArrayList<String> list = new ArrayList<>(playtime.keySet());
        Collections.sort(list, (o1,o2)->(playtime.get(o2).compareTo(playtime.get(o1))));
        for(int i=0;i< list.size();i++){
            int firstindex = 0;
            int secondindex = 0;
            int max=0;
            for(int j=0;j< genres.length;j++){
                if(list.get(i).equals(genres[j])){
                    if(plays[j]>max){
                        max = plays[j];
                        firstindex = j;
                    }
                }
            }
            max = -1;
            for(int j=0;j< genres.length;j++){
                if(list.get(i).equals(genres[j])){
                    if(j!=firstindex && plays[j] > max){
                        max = plays[j];
                        secondindex = j;
                    }
                }

            }
            answers.add(firstindex);
            if(max != -1)answers.add(secondindex);
        }

        int[] answer = new int[answers.size()];
        for(int i=0;i< answers.size();i++){
            answer[i] = answers.get(i);
        }
    }
}
