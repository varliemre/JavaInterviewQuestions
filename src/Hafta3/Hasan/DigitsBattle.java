package Hafta3.Hasan;

public class DigitsBattle {
    public static int battleOutcome(int number) {
        String numberStr = Integer.toString(number);
        String result = "";

        for (int i = 0; i < numberStr.length(); i += 2) {
            if (i + 1 < numberStr.length()) {
                char firstDigit = numberStr.charAt(i);
                char secondDigit = numberStr.charAt(i + 1);

                if (firstDigit > secondDigit) {
                    result += firstDigit;
                } else if (firstDigit < secondDigit) {
                    result += secondDigit;
                } // If the digits are equal, they both lose, so we do nothing
            } else {
                // If there's a single digit left, it automatically wins
                result += numberStr.charAt(i);
            }
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        // Examples
        System.out.println(battleOutcome(578921445)); // Output: 7925
        System.out.println(battleOutcome(32531));     // Output: 351
        System.out.println(battleOutcome(111));       // Output: 1
        System.out.println(battleOutcome(78925));     // Output: 895
    }
}
