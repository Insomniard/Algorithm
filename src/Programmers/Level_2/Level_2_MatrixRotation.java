package Programmers.Level_2;

import java.util.*;
public class Level_2_MatrixRotation {

    public static void main(String args[]) {
        int inputnum = 1;
        int rows = 6;
        int coloms = 6;
        int[][] queuries = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};
        int[][] marix = new int[rows + 1][coloms + 1];

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= coloms; j++) {
                marix[i][j] = inputnum;
                inputnum++;
            }
        }
        for (int q = 0; q < queuries.length; q++) {
            int sy = queuries[q][0];
            int sx = queuries[q][1];
            int fy = queuries[q][2];
            int fx = queuries[q][3];

        }
    }
}
