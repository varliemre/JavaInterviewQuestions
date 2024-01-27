package Hafta3.Hasan;

import java.util.Arrays;

public class RemoveWord {
    public static String searchWord(String str1, String str2) {
        String[] array = str1.split(" ");
        System.out.println(Arrays.deepToString(array));
        String result = "";
        for (String kelime : array) {
            if (!kelime.equals(str2)) {
                result += kelime+" ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String result = searchWord("hasan kalemi kırdı ve süpürdü","hasan");
        System.out.println(result);
    }
}
