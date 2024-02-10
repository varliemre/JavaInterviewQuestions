package Hafta5.Emre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        /*
         Verilen liste icerisindeki en kucuk degere sahip olan elementi tespit edip, ilk siraya tasiyan bir method yaziniz*/

        List<Integer> liste = new ArrayList<>(Arrays.asList(3, 1, 7, 2, 5));
        System.out.println("FirstList: " + liste);

        if (liste == null || liste.isEmpty()) {
            System.out.println("Liste boş veya null.");
        } else {
            int enKucukIndex = liste.indexOf(Collections.min(liste));
            if (enKucukIndex != 0) {
                int enKucuk = liste.remove(enKucukIndex);
                liste.add(0, enKucuk);
            }
        }

        System.out.println("LastList: " + liste);
    }
}

