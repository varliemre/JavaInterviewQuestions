package Hafta2.Sukru;

import Hafta1.Sukru.Reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q2 {

    public static void main(String[] args) {
        //Reverse Letters, Keep Numbers in Place

        //Create a function that reverses letters in a string but keeps digits in their current order.

        // Examples:

        //reverse("ab89c") ➞ "cb89a"
        //reverse("jkl5mn923o") ➞ "onm5lk923j"
        //reverse("123a45") ➞ "123a45"

        String str1 = "jkl5mn923o";
        String str2 = "ab89c";
        String str3 = "123a45";


        reverse(str1);
        System.out.println("---------------------------------------------------------------");
        reverse(str2);
        System.out.println("---------------------------------------------------------------");
        reverse(str3);


    }

    public static void reverse(String str) {
        //String deki harfler reverse yapilarak Linked Liste cevrildi
        LinkedList<String> list = new LinkedList<>();
        int index = 0;
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isLetter(str.charAt(i))) {
                list.add(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("list"+list);
        System.out.println("***********************");
        //Daha sonra String ifadedeki  sayilarin Indexini bulup listin bu indexlerine Sayilari yazdirdik
        for (int j = 0; j < str.length(); j++) {
            if (Character.isDigit(str.charAt(j))) {
                index = j;
                System.out.println("index" + index + "=" + str.charAt(j));
                list.add(index, str.charAt(j) + "");
            }

        }
        System.out.println("list = " + list);
        System.out.println();
        //Tekrardan String olarak yazdirdik
        String reverse = "";
        for (int i = 0; i < list.size(); i++) {
            reverse += list.get(i);


        }
        System.out.println("reverse="+reverse);
    }
}
