package Hafta3.Sükrü;

import java.util.Arrays;

public class Q3 {
   /* Q3- Unique Character Mapping

    Write a function that returns a character mapping from a word.

            Examples
    characterMapping("abcd") ➞ [0, 1, 2, 3]

    characterMapping("abb") ➞ [0, 1, 1]

    characterMapping("babbcb") ➞ [0, 1, 0, 0, 2, 0]

    characterMapping("hmmmmm") ➞ [0, 1, 1, 1, 1, 1]

    Notlar
    Sayacınıza 0'dan başlayın ve her yeni karakterle karşılaştığınızda 1 artırın.
    Aynı karakterler aynı sayıyı paylaşmalıdır.

    */
   public static void main(String[] args) {
      String str1="abacbd";
      int [] array=new int[str1.length()];
      String chars=new String();
      for (int i = 0; i < str1.length(); i++) {
         if (chars.indexOf(str1.charAt(i))==-1){
            chars+=str1.charAt(i);
         }
         array[i]=chars.indexOf(str1.charAt(i));

      }
      System.out.println(chars);
      System.out.println("Arrays.toString(array) = " + Arrays.toString(array));


   }
}
