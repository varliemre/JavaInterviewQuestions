package Hafta2.Sukru;

public class Q1 {
    public static void main(String[] args) {
        String str = "1213";


        validatePin(str);


    }

    public static void validatePin(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println();
            }
        }
        if (str.length()==4||str.length()==6){
            System.out.println("Girdiginiz pin gecerlidir");


        }else System.out.println("Girdiginiz pin gecerli degldir");
    }}













