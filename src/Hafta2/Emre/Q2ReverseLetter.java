package Hafta2.Emre;

public class Q2ReverseLetter {
    public static String reverse(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            if (Character.isLetter(charArray[start]) && Character.isLetter(charArray[end])) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            } else {
                if (!Character.isLetter(charArray[start])) {
                    start++;
                }
                if (!Character.isLetter(charArray[end])) {
                    end--;
                }
            }
        }
        return new String(charArray);
    }
    public static void main(String[] args) {
        System.out.println(reverse("ab89c"));       // ➞ "cb89a"
        System.out.println(reverse("jkl5mn923o"));  // ➞ "onm5lk923j"
        System.out.println(reverse("123a45"));      // ➞ "123a45"
    }

}
