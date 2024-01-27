package Hafta3.Emre;

public class RemoveWord {
    public static void main(String[] args) {
        System.out.println(removeWord("Bob has a kid", "Bob"));
    }

    public static String removeWord(String a, String b){

        String newString = a.replace(b,"");
        newString.trim();

        return newString;

    }
}
