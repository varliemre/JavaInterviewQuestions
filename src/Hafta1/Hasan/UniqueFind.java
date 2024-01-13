package Hafta1.Hasan;

public class UniqueFind {
    //4- Kullanicidan alinan String bir degerdeki Unique olan karakterleri döndürebilen programi yaziniz.
    //   input :  AABCCD
    //   Output:  BD
    public static String uniqueFind(String str) {
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result += str.charAt(i);
            }
            count = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        String myStr = "DXDEECKGDDEEEEFGGDCXDD";
        System.out.println("uniqueFind(myStr) = " + uniqueFind(myStr));
    }
}
