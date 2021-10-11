package LeetCode;
import java.util.*;
public class MedianofTwoSortedArrays {
    public static void main(String args[]){
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        ArrayList<Double> list = new ArrayList<>();
        for(int i=0;i< nums1.length;i++)list.add((double)nums1[i]);
        for(int i=0;i< nums2.length;i++)list.add((double)nums2[i]);
        Collections.sort(list);
        double answer;
        if(list.size() %2 == 0){
            answer = (list.get(list.size()/2) + list.get((list.size()/2)-1))/2;
        }
        else{
            answer = list.get((list.size()/2));
        }
        System.out.println(answer);
    }
}
