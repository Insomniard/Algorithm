package Programmers;
import java.util.*;
public class Level_2_OpenChatting {
    public static void main(String args[]){
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        Map<String, String> map = new LinkedHashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<record.length;i++){
            String[] temp = record[i].split(" ");
            if(temp.length>2){
                if(temp[0].equals("Enter")){
                    list.add(temp[1]+"님이 들어왔습니다.");
                    map.put(temp[1], temp[2]);
                }
                else if(temp[0].equals("Change"))map.put(temp[1], temp[2]);
            }
            else if(temp.length==2){
                list.add(temp[1]+"님이 나갔습니다.");
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0;i< list.size();i++) {
            String key = list.get(i).substring(0, list.get(i).indexOf("님"));
            answer[i] = list.get(i).replace(key, map.get(key));
        }
    }
}
