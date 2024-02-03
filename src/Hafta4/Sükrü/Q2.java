package Hafta4.Sükrü;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q2 {

   /** Q2:
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

            Example 1:
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]

    Example 2:
    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation:
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]
    */
   public static void main(String[] args) {
       List<Integer> list1 = new LinkedList<>(Arrays.asList(7, 1, 2, 3, 4, 5, 6));
       int k = 4;
       listDuzenleme(list1,k);
   }
   public static void listDuzenleme(List<Integer> list1,int k) {
       List<Integer>list2=new LinkedList<>();//Yeni bir Linked List olusturduk
       System.out.println(list1);//
       System.out.println(list1.subList(list1.size() - k, list1.size()));//k tane eleman sondan kesildi
       list2.addAll(list1.subList(list1.size() - k, list1.size()));//Sonra bu olusturulan yeni linked Liste kesilen elemanlar eklendi
       System.out.println("list2 = " + list2);//Yeni list yazdirildi
       System.out.println(list1.subList(0, list1.size()-k));//Sonra k kadar kesildikten sonra kalanlar bulundu
       list2.addAll(list1.subList(0, list1.size()-k));//ve bu kalnlarda Listin sonuna eklendi
       System.out.println(list2);//ve Yeni List yazdirildi

   }

}
