package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_1920 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> word = new HashMap<>();
        Map<String, Integer> puzzle = new HashMap<>();
        while (!br.readLine().equals("-")){
            String[] words = br.readLine().split("");
            for(int i=0;i<words.length;i++){
                word.put(words[i], word.getOrDefault(words[i], 0) + 1);
            }
        }
        while (!br.readLine().equals("#")){
            String[] puzzles = br.readLine().split("");
            for(int i=0;i<puzzles.length;i++){
                puzzle.put(puzzles[i], puzzle.getOrDefault(puzzles[i], 0)+1);
            }
        }
        System.out.println(word.toString());
        System.out.println(puzzle.toString());

    }
}
