package Hafta2.Sukru;

public class Q1 {
    public static void main(String[] args) {
        String str = "123545a";


        validatePin(str);

    }

    public static void validatePin(String str) {

        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                str2 += str.charAt(i);

            }
        }

        if (str.isEmpty() && str.length() == 4 || str.length() == 6) {
            System.out.println("Girdiginiz pin gecerlidir");
        } else System.out.println("Girdiginiz pin gecerli degldir");
    }
}















