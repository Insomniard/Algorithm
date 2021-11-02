package Programmers.Level_2;

public class Level_2_carpet {
    public static void main(String args[]){
        int brown = 10;
        int yellow = 2;
        int[] answer = new int[2];
        for(int i=3;i<brown+yellow;i++){
            int width = i;
            int length = (brown + yellow) / i;
            int center = (length - 2) * (width - 2);
            if(center == yellow && width>=length){
                answer[0] = width;
                answer[1] = length;
            }
        }
        System.out.println(answer[0] +  " " + answer[1]);
    }
}
