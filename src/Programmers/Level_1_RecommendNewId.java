package Programmers;
import java.util.*;
public class Level_1_RecommendNewId {
    public static void main(String args[]){
        /*
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
        while (answer.contains("..")){
            answer = answer.replace("...",".");
            answer = answer.replace("..",".");
        }

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
        => 기본적인 방식
         */

        /*
        String new_id = "abcdefghijklmn.p";
        new_id = new_id.toLowerCase();
        String answer=new_id;
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        answer = answer.replaceAll("[.]{2,}",".");
        answer = answer.replaceAll("^[.]|[.]$","");
        if(answer.equals(""))answer+="a";
        if(answer.length() > 15){
            answer = answer.substring(0,15);
            answer = answer.replaceAll("^[.]|[.]$","");
        }
        if(answer.length()<3)while (answer.length() < 3)answer+= answer.charAt(answer.length()-1);
        System.out.println(answer);
        => 정규식
        */
    }
}
