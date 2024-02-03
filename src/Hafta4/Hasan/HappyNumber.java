package Hafta4.Hasan;

import java.util.ArrayList;

public class HappyNumber {
    public static int sumOfSquares(int num){  // 19-->82
        int sum=0;
        while (num>0){
            int digit = num%10;
            sum += digit*digit;
            num = num/10;
        }
        return sum;
    }
    public static boolean isHappy(int number) {
        ArrayList<Integer> st = new ArrayList<>();
        while (number != 1 && !st.contains(number)) {
            st.add(number);
            number = sumOfSquares(number);
        }
        return number == 1;
    }
    public static void main(String[] args) {
        System.out.println("isHappy(19) = " + isHappy(19));
        System.out.println(isHappy(123));
        System.out.println(sumOfSquares(192));
    }
}

