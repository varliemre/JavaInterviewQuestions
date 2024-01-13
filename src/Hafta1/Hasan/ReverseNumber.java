package Hafta1.Hasan;

import java.util.Scanner;

public class ReverseNumber {
    //2- Bir sayıyı ters çeviren java kodunu yazin.
    //Input =   45987
    //Output = 78954
    public static void main(String[] args) {
        int sayi;
        int tersSayi=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen tersine çevrilmesini istediginiz sayiyi giriniz :  ");
        sayi=scanner.nextInt();
        while (sayi>0){
            tersSayi = tersSayi * 10 + sayi % 10;
            sayi = sayi/10;
        }
        System.out.println(tersSayi);
    }
}
