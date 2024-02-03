package Hafta4.Hasan;

import java.util.Arrays;

public class Q2_2 {
    public static void reverse(int nums[], int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k < 0) {
            k += nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
        return nums;
    }

    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6, 7};
        int[] newList = rotate(list1, 3);
        System.out.println(Arrays.toString(newList));
    }
}
