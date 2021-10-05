package Programmers.Level_2;
import java.util.*;
public class Level_2_Newsclustering {
    public static void main(String args[]){
        String str1 = "handshake";
        String str2 = "shake hands";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> gyo = new ArrayList<>();
        ArrayList<String> hab = new ArrayList<>();
        for(int i=0;i<str1.length()-1;i++){
            char first = str1.charAt(i);
            char next = str1.charAt(i+1);
            String check = Character.toString(first) + Character.toString(next);
            if(isLetter(check))list1.add(check);
        }
        for(int i=0;i<str2.length()-1;i++){
            char first = str2.charAt(i);
            char next = str2.charAt(i+1);
            String check = Character.toString(first) + Character.toString(next);
            if(isLetter(check))list2.add(check);
        }
        for(int i=0;i<list1.size();i++){
            if(list2.remove(list1.get(i))) gyo.add(list1.get(i));
            hab.add(list1.get(i));
        }
        hab.addAll(list2);
        if(hab.size() == 0)return;
        double div = (double) gyo.size() / (double) hab.size();
        int answer = (int)div;
        System.out.println(hab.toString());
        System.out.println(div);
    }
    public static boolean isLetter(String s){
        if(s.matches("^[a-z]*$"))return true;
        else return false;
    }
}
