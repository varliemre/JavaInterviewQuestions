package Hafta3.Sükrü;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q1 {

    /**
     * Q1- Extract a Word From a Sentence
     * <p>
     * Implement a method removeWord() that takes two string parameters:
     * <p>
     * sentence - the sentence you are to remove a word from.
     * word - the word you are to remove from the sentence.
     * Your method should take a string, sentence and remove word from it. It will return a new string without word in the sentence.
     * <p>
     * Examples
     * removeWord("One two three four", "two") ➞ "One three four"
     * <p>
     * removeWord("Bob has a kid", "kid") ➞ "Bob has a"
     * Notes
     * Use the Resources section if you need help.
     */
    public static void main(String[] args) {


        String str1 = "One two three four";
        String str2 = "two";
        String resut = "";
        removeWord(str1, str2);
    }

    public static void removeWord(String str1, String str2) {
        String[] array1 = str1.split(" ");
        System.out.println("Arrays.deepToString(str1) = " + Arrays.deepToString(array1));
        //////////////////////////////
       List<String>list=new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            list.add(array1[i]);
        }
        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str2)){
                list.remove(list.get(i));
            }
        }
        System.out.println("list = " + list);
    }
}








