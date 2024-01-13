package Hafta1.Sukru;

public class Palindrome {

    public static void main(String[] args) {
        // 3- Java ile kullanıcınin girdiği değerin palindrom sayı olup olmadığını bulan java kodunu yazınız.
        //Palindromik sayı, sağdan sola okunduğunda da aynı şekilde okunan sayılardır. Yani bir sayının rakamları, ters sırayla
        //yazıldığında aynı sayı oluşuyorsa, o sayı palindromiktir.
        //Örneğin, 121, 1221, 12321 gibi sayılar palindromiktir. Ancak, 123, 1234 gibi sayılar palindromik değillerdir.
        //Burda PAlindrome  sayi reversesi kendisine esit olan sayi diyebiliriz

        String str = "12321";
        palindrome(str);
    }

    public static void palindrome(String str1) {
        String str2 = "";

        for (int i = str1.length() - 1; i >= 0; i--) {//reverse
            str2 += str1.charAt(i);

        }
        System.out.println("str2 ="+str2);
        if (str1.equals(str2)) {
            System.out.println("!!!Vermis oldugunuz String  =" + str1 + "  palindromdur!!!");
        } else System.out.println("!!!Vermis oldugunuz String  =" + str1 + "  palindrom degildir!!!");

    }

}

