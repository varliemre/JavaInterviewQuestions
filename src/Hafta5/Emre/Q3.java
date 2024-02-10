package Hafta5.Emre;

import java.util.Scanner;

public class Q3 {
    /*
        3-nWrite a Java program to calculate the factorial of a given number.
        For example, if the input is 5, the output should be 120 (5! = 5 x 4 x 3 x 2 x 1).
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int faktoriyel = 1;

        System.out.println("Bir sayi girin: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!= " + faktoriyel);
    }
}
