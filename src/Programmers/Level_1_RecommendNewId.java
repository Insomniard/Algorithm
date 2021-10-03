package Programmers;
import java.util.*;
public class Level_1_RecommendNewId {
    public static void main(String args[]){
        ArrayList<Boolean> check = new ArrayList<>();
        String new_id = "abcdefghijklmn.p";
        new_id = new_id.toLowerCase();
        String[] newId = new_id.split("");
        String answer="";
        for(int i=0;i<newId.length;i++){
            if(newId[i].matches(".*[a-z].*"))answer+=newId[i];
            else if(newId[i].matches(".*[0-9].*"))answer+=newId[i];
            else if(newId[i].equals("-"))answer+=newId[i];
            else if(newId[i].equals("_"))answer+=newId[i];
            else if(newId[i].equals("."))answer+=newId[i];
        }
        answer = answer.replace("...",".");
        answer = answer.replace("..",".");

        if(answer.startsWith(".")){
            answer = answer.substring(1,answer.length());
        }
        if(answer.endsWith(".")){
            answer = answer.substring(0,answer.length()-1);
        }
        if(answer.length()==0)answer+="a";
        if(answer.length()>15)answer = answer.substring(0,14);
        if(answer.length()<=2){
            while (answer.length()<3)
            answer+=answer.charAt(answer.length()-1);
        }
        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }
    }
}
