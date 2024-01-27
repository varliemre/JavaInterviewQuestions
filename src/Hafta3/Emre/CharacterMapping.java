package Hafta3.Emre;

import java.util.Arrays;

public class CharacterMapping {
    public static void main(String[] args) {


        String str1="abacbdefgkkllmnjj";
        int [] array=new int[str1.length()];
        String chars=new String();
        for (int i = 0; i < str1.length(); i++) {
            if (chars.indexOf(str1.charAt(i))==-1){
                chars+=str1.charAt(i);
            }
            array[i]=chars.indexOf(str1.charAt(i));

        }
        System.out.println(chars);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }
}
