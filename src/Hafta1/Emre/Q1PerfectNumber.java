package Hafta1.Emre;

import java.util.Scanner;

public class Q1PerfectNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = input.nextInt();

        int sum = 0;
        for (int i = 1; i < number ; i++) {
            if (number % i == 0){
                sum+=i;
            }
        }
        if (sum == number){
            System.out.println(number + " is a Perfect Number");
        }else {
            System.out.println(number + " is a NOT Perfect Number");
        }
    }
}
