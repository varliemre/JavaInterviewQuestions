package Hafta5.Emre;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        /*
        * 1- Bir listedeki (ArrayList gibi) sayısal değerlerin toplamını hesaplayan ve sonucu bir wrapper sınıf olan
          Integer tipinde döndüren bir Java programı yazın.*/

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Lütfen Sayilari girin.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Yanlis Giris");
            }
        }

        Integer sum = calculateSum(numbers);
        System.out.println("sum = " + sum);

    }

    public static Integer calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
