package Hafta4.Emre;

public class Q3MaxMoney {

    /*
                * You are a professional robber planning to rob houses along a street.
            Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is
            that adjacent houses have security systems connected and it will automatically contact the police
            if two adjacent houses were broken into on the same night.
            (Bir sokak boyunca evleri soymayı planlayan profesyonel bir soyguncusunuz.
            Her evde belirli bir miktar para saklı, her birini soymanızı engelleyen tek kısıtlama,
            bitişik evlerin güvenlik sistemlerinin bağlı olması ve aynı gece iki bitişik eve girilirse
            otomatik olarak polisle iletişime geçecek olmasıdır.)

            Given an integer array nums representing the amount of money of each house,
            return the maximum amount of money you can rob tonight without alerting the police.

            Example 1:

            Input: nums = [1,2,3,1]
            Output: 4
            Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
            Total amount you can rob = 1 + 3 = 4.
            Example 2:

            Input: nums = [2,7,9,3,1]
            Output: 12
            Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
            Total amount you can rob = 2 + 9 + 1 = 12.
* */

    public static int arsenLupen(int[] numbers) {

        int length = numbers.length;

        int[] yeniListe = new int[length];
        yeniListe[0] = numbers[0];
        yeniListe[1] = Math.max(numbers[0], numbers[1]);   // 1 ve 2 basamaktan en büyük hangisi ise onu al. referans olsutur...

        for (int i = 2; i < length; i++) {
            yeniListe[i] = Math.max(yeniListe[i - 1], yeniListe[i - 2] + numbers[i]);
        }

        return yeniListe[length - 1];
    }

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 1};
        System.out.println("Numbers1 - Maksimum toplam " + arsenLupen(numbers1));

        int[] numbers2 = {2, 7, 9, 3, 1};
        System.out.println("Numbers2 - Maksimum Toplam " + arsenLupen(numbers2));
    }
}
