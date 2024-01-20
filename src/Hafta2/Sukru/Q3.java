package Hafta2.Sukru;

import java.sql.Array;
import java.util.Arrays;

public class Q3 {

    public static void main(String[] args) {


        String str1 = "For the love of Tesh. She is the love of my life. I am all hers.";
        String str2="love";
         String str3 = "I have a cat. I have a mat. Things are going swell.";
         String str4 = "have";

        searchWord(str1,str2);
        searchWord(str3,str4);

    }
    public static void searchWord(String str1,String str2){
        String [] array=str1.split("\\.");
        System.out.println(Arrays.deepToString(array));
        int counter=0;
        for (String eleman:array){
            if (eleman.toLowerCase().contains(str2)){
                counter++;
            }
            if (counter==1){
            System.out.println("eleman = " + eleman+".");
                break;
        }
    }
}}
