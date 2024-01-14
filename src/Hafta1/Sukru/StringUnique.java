package Hafta1.Sukru;

public class StringUnique {
    public static void main(String[] args) {
        //4- Kullanicidan alinan String bir degerdeki Unique olan karakterleri döndürebilen praogrami yaziniz.
        //Ex:
        //input :  AABCCD
        //Output:  BD
        String str = "AABCCD";
        System.out.println("unique(str) = " + unique(str));
    }

    public static String unique(String str) {
        String strUnque = "";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;

                }
            }
                if (counter == 1) {
                    strUnque += str.charAt(i);
                }
            counter = 0;
            }


      return strUnque;
        }

    }



