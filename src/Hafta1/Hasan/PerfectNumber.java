package Hafta1.Hasan;

import java.util.Scanner;

public class PerfectNumber {
    //1- Bir sayının Mükemmel bir sayı olup olmadığını bulan metodu yazin.
    //Mükemmel sayı, sayılar teorisinde, kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayıdir. Diğer bir
    //ifadeyle, bir mükemmel sayı, bütün pozitif tam bölenlerinin toplamının yarısına eşittir.
    //6=> 1 2 3 6 Mükemmel sayıdır.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Lütfen Bir Sayi Giriniz : ");
            int sayi = scanner.nextInt();
            int toplam =0;
            for (int i =1;i<=sayi;i++){
                if (sayi%i==0){
                    toplam += i;
                }
            }
            if (toplam/2==sayi){
                System.out.println(sayi +" bir Mükemmel sayidir..");
                break;
            }else {
                System.out.println(sayi +" bir Mükemmel sayi değildir..");
            }
        }
    }
}

