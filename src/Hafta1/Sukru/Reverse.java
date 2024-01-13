package Hafta1.Sukru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Hasan","Emre"));

        System.out.println(list1);

        Collections.reverse(list1);
        System.out.println(list1);

//2 .cöuüm method ile
        String str="123456789";
        reverse(str);

    }
    public static void reverse(String str){

        String reverse="";
        for (int i = str.length()-1; i>=0; i--) {
            reverse+=str.charAt(i);

        }
        System.out.println("reverse ="+ reverse);
    }

}
