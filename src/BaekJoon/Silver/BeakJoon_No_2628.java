import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class  BeakJoon_No_2628 {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        ArrayList<Integer> widthList = new ArrayList<>();
        ArrayList<Integer> lengthList = new ArrayList<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int width=Integer.parseInt(st.nextToken());
        int height=Integer.parseInt(st.nextToken());
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++) {
            st=new StringTokenizer(br.readLine());
            int where=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            if(where==1) {
                widthList.add(k);
            }else {
                lengthList.add(k);
            }
        }
        Collections.sort(widthList);
        Collections.sort(lengthList);
        int w=0;
        int start=0;
        for(int i=0;i<widthList.size();i++) {
            if(widthList.get(i)-start>w) {
                w=widthList.get(i)-start;
            }
            start=widthList.get(i);
        }
        if(width-start>w) {
            w=width-start;
        }
        int h=0;
        start=0;
        for(int i=0;i<lengthList.size();i++) {
            if(lengthList.get(i)-start>h) {
                h=lengthList.get(i)-start;
            }
            start=lengthList.get(i);
        }
        if(height-start>h) {
            h=height-start;
        }
        System.out.println(h*w);
    }
}
