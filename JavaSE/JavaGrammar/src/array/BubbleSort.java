package array;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author LiZijing
 * @date 2022/1/23
 */
public class BubbleSort {
  /*
  冒泡排序：
  1.比较数组中相邻的两个元素，若第一个数比第二个数大/小，则交换他们的位置
  2.每一次比较都会产生出一个最大/最小的数字
  3.下一轮则少一次排序
  4.一次排序直到结束
   */

  public static void sort(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = nums.length - 1; j > i; j--) {
        if (nums[j] < nums[j - 1]) {
          int temp = nums[j - 1];
          nums[j - 1] = nums[j];
          nums[j] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = {10, 2, 5, 7, 3};
    System.out.println(Arrays.toString(nums));
    BubbleSort.sort(nums);
    System.out.println(Arrays.toString(nums));
  }
}
