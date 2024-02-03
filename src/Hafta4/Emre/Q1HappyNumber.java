package Hafta4.Emre;

import java.util.ArrayList;

public class Q1HappyNumber {

    /*
    * Q1:
            Write an algorithm to determine if a number n is happy.
            A happy number is a number defined by the following process:
            Starting with any positive integer, replace the number by the sum of the squares of its digits.
            Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
            Those numbers for which this process ends in 1 are happy.
            Return true if n is a happy number, and false if not.

            Example:
            Input: n = 19
            Output: true
            Explanation:
            12 + 92 = 82
            82 + 22 = 68
            62 + 82 = 100
            12 + 02 + 02 = 1
**/

    public static void main(String[] args) {

        int number = 22;
        boolean sonuc = mutluSayiMi(number);

        if(sonuc){
            System.out.println(number + " mutlu sayidir.");
        }else {
            System.out.println(number + " mutlu sayi degildir.");
        }

    }
    public static int kareleriToplami(int num) {
        int toplam = 0;

        while (num>0){
            int sonBasamak = num % 10;
            num = num / 10;
            toplam += sonBasamak * sonBasamak;
        }
        return toplam;
    }

    public static boolean mutluSayiMi(int num){
        ArrayList<Integer> list = new ArrayList<>();

        while (num != 1 && !list.contains(num)){
            list.add(num);
            num = kareleriToplami(num);
        }
        return num == 1;
    }
}
