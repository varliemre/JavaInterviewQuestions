package Hafta1.Sukru;

import java.util.Scanner;

public class MükemmelSayi {
    public static void main(String[] args) {
        //1- Bir sayının Mükemmel bir sayı olup olmadığını bulan metodu yazin.
        //Mükemmel sayı, sayılar teorisinde, kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayıdir. Diğer bir
        //ifadeyle, bir mükemmel sayı, bütün pozitif tam bölenlerinin toplamının yarısına eşittir.
        //6=> 1 2 3 Mükemmel sayıdır.
        Scanner scanner=new Scanner(System.in);
        System.out.println("eine Number eingeben");
        int say=scanner.nextInt();
        mükemmelSayi(say);

    }
    public static  void mükemmelSayi(int say) {
        try {
            int positivBolenlerininToplami = 0;
            for (int i = 1; i <= say; i++) {
                if (say % i == 0) {
                    positivBolenlerininToplami += i;
                }
            }
            System.out.println("Positiv bölenlerinin Toplami= "+positivBolenlerininToplami);
            int postblYarisi=(positivBolenlerininToplami/2);
            System.out.println("Positiv Bölelerinin Yarisi = "+postblYarisi);
            if (postblYarisi == say) {
                System.out.println(say + " ist eine prfecte Number");
            } else System.out.println(say + " ist keine perfecte Number");
        } catch (Exception e) {
            System.out.println("Hata =" + e.getMessage());
        }

    }}