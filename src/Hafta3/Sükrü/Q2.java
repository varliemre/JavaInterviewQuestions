package Hafta3.Sükrü;

import javax.swing.*;

public class Q2 {
    /**
     * 2- Digits Battle!
     * <p>
     * Starting from the left side of an integer, adjacent digits pair up in "battle" and the larger digit wins. If two digits are the same,
     * they both lose. A lone digit automatically wins.
     * <p>
     * Create a function that returns the victorious digits.
     * <p>
     * To illustrate:
     * <p>
     * battleOutcome(578921445) ➞ 7925
     * // [57]: 7 wins; [89] 9 wins; [21] 2 wins;
     * // [44] neither wins; 5 (automatically) wins
     * Examples
     * battleOutcome(32531) ➞ 351
     * // 3 deffeats 2, 5 defeats 3, 1 is a single.
     * <p>
     * battleOutcome(111) ➞ 1
     * // 1 and 1 tie, so neither move on, last 1 is a single.
     * <p>
     * battleOutcome(78925) ➞ 895
     * <p>
     * Notes:
     * There are no winners in a battle with equal digits (neither should be printed).
     * If the length of the number is odd, the lone digit should be printed at the end of the number.
     */
    public static void main(String[] args) {
        String str1 = "578921445";
        String str3 = "32531";
        battleOutcome(str1);
        battleOutcome(str3);

    }
    public static void battleOutcome(String str1) {

        int indexSayac = 1;
        String str2 = "";
        if (str1.length() % 2 == 1) {//Tek sayi olma durumu
            str1 += 0;
        }
        System.out.println(str1);

        for (int i = 0; i < str1.length(); i++) {


            if ((i == (indexSayac))) {
                if (str1.charAt(i) > str1.charAt(i - 1)) {//büyük olma durumu
                    str2 += str1.charAt(i);
                } else if (str1.charAt(i) < str1.charAt(i - 1)) {
                    str2 += str1.charAt(i-1);
                } else if (str1.charAt(i) == str1.charAt(i - 1)) {//Esitlik durumu
                    str2 += "";
                }
                indexSayac += 2;
            }
        }
        System.out.println("str2 = " + str2);
    }}






