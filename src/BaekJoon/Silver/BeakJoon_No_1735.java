package BaekJoon.Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BeakJoon_No_1735 {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        int firstMolecule = scan.nextInt();
        int firstDenominator = scan.nextInt();
        int secondMolecule = scan.nextInt();
        int secondDenominator = scan.nextInt();
        int answerMolecule = (firstMolecule * secondDenominator) + (firstDenominator * secondMolecule);
        int answerDenominator = firstDenominator * secondDenominator;
        int gcFactor = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (gcFactor<=answerDenominator){
            if(answerMolecule % gcFactor == 0 && answerDenominator % gcFactor == 0){
                list.add(gcFactor);
            }
            gcFactor++;
        }
        if(list.size()>0)gcFactor = Collections.max(list);
        else gcFactor = 1;
        System.out.println(answerMolecule/gcFactor + " " + answerDenominator/gcFactor);
    }
}
