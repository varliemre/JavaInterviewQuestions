package Hafta1.Emre;

import java.util.Scanner;

public class Q4UniqueCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String Value : ");
        String str = scanner.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                result += ch;
            }
        }
        System.out.println(result);
    }
}
