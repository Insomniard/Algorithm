package Programmers.Level_2;
import java.util.*;
public class Level_2_SkillTree {
    public static void main(String args[]) {
        String skill = "CBD";
        String[] skillTrees = {"BACDE", "CBADF", "AECB", "BDA"};
        solution(skill,skillTrees);

    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[] str = skill.split("");
        for (int i = 0; i < skill_trees.length; i++) {
            boolean check = false;
            Stack<String> s = new Stack<String>();
            for (int j = str.length - 1; j >= 0; j--) {
                s.push(str[j]);
            }
            String[] skillStr = skill_trees[i].split("");
            for (int j = 0; j < skillStr.length; j++) {
                if (skill.contains(skillStr[j])) {
                    if (s.peek().equals(skillStr[j])) {
                        s.pop();
                    } else {
                        check = true;
                        break;
                    }

                }

            }
            if (check == false) answer++;
        }
        return answer;
    }
}
