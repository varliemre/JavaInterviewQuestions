package Hafta1.Hasan;

import java.util.Scanner;

public class PalindromNumber {
    //3- Java ile kullanıcınin girdiği değerin palindrom sayı olup olmadığını bulan java kodunu yazınız.
    //Palindromik sayı, sağdan sola okunduğunda da aynı şekilde okunan sayılardır.
    // Yani bir sayının rakamları, ters sırayla
    //yazıldığında aynı sayı oluşuyorsa, o sayı palindromiktir.
    //Örneğin, 121, 1221, 12321 gibi sayılar palindromiktir. Ancak, 123, 1234 gibi sayılar palindromik değillerdir.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        int tersSayi=0;

        System.out.print("Lütfen palindromik olma durumunu kontrol etmek istediginiz sayiyi giriniz :  ");
        sayi=scanner.nextInt();

        while (sayi>0){
            tersSayi = (tersSayi * 10) + (sayi % 10);
            sayi = sayi/10;
        }
        System.out.println(tersSayi);

        if (sayi==tersSayi){
            System.out.println( sayi + "  bir palindromik sayidir..");
        }else System.out.println(sayi + " bir palindromik sayi değildir");
    }
}