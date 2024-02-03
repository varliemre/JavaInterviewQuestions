package Hafta4.Hasan;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        int k=3;
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list1.add(11);
        list1.add(12);
        System.out.println("Original List: " + list1);

        // Calculate the effective rotation steps (handle cases where k > size of the array)
        k %= list1.size();

        // Create a sublist with the elements to be rotated
        ArrayList<Integer> list2 = new ArrayList<>(list1.subList(list1.size() - k, list1.size()));
        System.out.println("list2 " + list2);

        // Remove the rotated elements from the original list
        list1.subList(list1.size() - k, list1.size()).clear();
        System.out.println("list1 = " + list1);

        // Insert the rotated elements at the beginning of the original list
        list1.addAll(0, list2);

        System.out.println("Rotated List: " + list1);
    }
}
