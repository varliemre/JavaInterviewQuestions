package Hafta3.Emre;

public class DigitsBattle {

    public static void main(String[] args) {


        String str = "578921445";
        System.out.println("victoryNumbers(str) = " + victoryNumbers(str));

    }


    public static String victoryNumbers(String str) {

        StringBuilder str2 = new StringBuilder();
        if (str.length() % 2 == 1) {
            str += 0;
            System.out.println("str = " + str);
        }

        for (int i = 0; i < str.length(); i += 2) {

            if (str.charAt(i) > str.charAt(i + 1)) {
                str2.append(str.charAt(i));
            } else if (str.charAt(i) < str.charAt(i+1)) {
                str2.append(str.charAt(i + 1));
            } else if (str.charAt(i) == str.charAt(i+1)) {
                str2.append("");
            }

        }
        return str2.toString();
    }

}
