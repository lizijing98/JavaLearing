package array;

/**
 * 数组使用
 *
 * @author LiZijing
 * @date 2022/1/23
 */
public class UseArray {
  public static void forEach() {
    int[] nums = {1, 2, 3, 4, 5};
    printArray(nums);
    printArray(reverseArray(nums));
  }

  public static void main(String[] args) {
    forEach();
  }

  public static void printArray(int[] nums) {
    for (int num : nums) {
      System.out.println(num);
    }
  }

  public static int[] reverseArray(int[] nums) {
    int[] reNums = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      reNums[i] = nums[nums.length - 1 - i];
    }
    return reNums;
  }
}
