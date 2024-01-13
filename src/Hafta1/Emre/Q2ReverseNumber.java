package Hafta1.Emre;

import java.util.Scanner;

public class Q2ReverseNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = input.nextInt();

        System.out.println("Input: " + number);
        System.out.println("Output: " + reverseNumber(number));

    }
    public static int reverseNumber(int number){
        int reversed = 0;

        while (number > 0){
            int lastNumber = number % 10;
            reversed = reversed * 10 + lastNumber;
            number /= 10;
        }
        return reversed;
    }
}
