package Programmers.Level_2;

import java.util.*;
public class Level_2_PhoneBook {
    public static void main(String args[]) {
        String[] phone_book = {"1195524421", "97674223", "119"};

        boolean answer = true;
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], phone_book[i]);
        }
        for (String key : map.keySet()) {
            int count = 0;
            for (int i = 0; i < key.length(); i++) {

                count++;
            }
        }
        System.out.println(answer);
    }
}
