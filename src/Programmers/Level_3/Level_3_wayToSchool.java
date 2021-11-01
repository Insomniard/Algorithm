package Programmers.Level_3;

public class Level_3_wayToSchool {
    public static void main(String args[]){
        Level_3_wayToSchool answer = new Level_3_wayToSchool();
        int m =4;
        int n = 3;
        int[][] puddles = {{2,2}};
        System.out.println(answer.solution(m,n,puddles));
    }
    public int solution(int m,int n,int[][] puddles){
        int[][] map = new int[m][n];
        for(int i=0;i< puddles.length;i++){
            map[puddles[i][0]-1][puddles[i][1]-1]=-1;
        }

        map[0][0] = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(map[i][j] == -1){
                    map[i][j] = 0;
                    continue;
                }
                if(i>0)map[i][j] += (map[i-1][j] % 1000000007);
                if(j>0)map[i][j] += (map[i][j-1] % 1000000007);
            }
        }
        int answer = map[m-1][n-1];
        return answer % 1000000007;
    }
}
