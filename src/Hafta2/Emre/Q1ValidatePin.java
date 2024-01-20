package Hafta2.Emre;

public class Q1ValidatePin {
    public static boolean validate(String pin) {
        int length = pin.length();
        if (length == 4 || length == 6) {
            for (int i = 0; i < length; i++) {
                if (!Character.isDigit(pin.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(validate("121317"));
        System.out.println(validate("1234"));
        System.out.println(validate("45135"));
        System.out.println(validate("89abc1"));
        System.out.println(validate("89ab c1"));


    }

}
