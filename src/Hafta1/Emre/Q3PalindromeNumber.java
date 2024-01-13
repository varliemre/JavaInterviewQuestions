package Hafta1.Emre;

import java.util.Scanner;

public class Q3PalindromeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = input.nextInt();

        int originalNumber = number;
        int reversed =0;

        while(number > 0){
            int lastNumber = number % 10;
           reversed = reversed * 10 + lastNumber;
           number /= 10;
        }
        if (reversed == originalNumber){
            System.out.println(originalNumber + " is a Palindrome Number.");
        }else {
            System.out.println(originalNumber + " is an NOT Palindrome Number");
        }
    }
}
