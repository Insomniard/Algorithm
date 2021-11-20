package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BeakJoon_No_1148 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> wordsList = new ArrayList<>();
        ArrayList<String> puzzleList = new ArrayList<>();
        String inputWord = "";
        String inputPuzzle = "";
        while (true) {
            inputWord = br.readLine();
            if (inputWord.equals("-")) break;
            wordsList.add(inputWord);
        }
        while (true) {
            inputPuzzle = br.readLine();
            if (inputPuzzle.equals("#")) break;
            puzzleList.add(inputPuzzle);
            for(int i=0;i< wordsList.size();i++){
                Map<String, Integer> map = new HashMap<>();
                String[] word = wordsList.get(i).split("");
                for(int j=0;j< word.length;j++){
                    map.put(word[j], map.getOrDefault(word[j], 0)+1);
                }
            }
        }

        System.out.println(wordsList.toString());
        System.out.println(puzzleList.toString());
    }
}
