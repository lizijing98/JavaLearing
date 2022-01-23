package array;

import java.util.Arrays;

/**
 * 稀疏数组
 *
 * @author LiZijing
 * @date 2022/1/23
 */
public class SparseArray {
  static int[][] nums = {
    {0, 0, 0, 1, 0},
    {3, 0, 0, 2, 4},
    {0, 0, 0, 1, 9},
    {0, 0, 8, 0, 0}
  };
  // {行,列,值}
  int[][] thinNums = {
    {4, 5, 0},
    {0, 3, 1},
    {1, 0, 3},
    {1, 3, 2},
    {1, 4, 4},
    {2, 3, 1},
    {2, 4, 9},
    {3, 2, 8}
  };

  public static int[][] thin(int[][] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] != 0) {
          sum++;
        }
      }
    }

    int[][] thinArrays = new int[sum + 1][3];
    int mark = 1;
    thinArrays[0][0] = nums.length;
    thinArrays[0][1] = nums[0].length;
    thinArrays[0][2] = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] != 0) {
          thinArrays[mark][0] = i;
          thinArrays[mark][1] = j;
          thinArrays[mark][2] = nums[i][j];
          mark++;
        }
      }
    }
    return thinArrays;
  }

  public static int[][] reThin(int[][] thinNums){
    int[][] reThin=new int[thinNums[0][0]][thinNums[0][1]];
    for (int i = 1; i < thinNums.length; i++) {
      reThin[thinNums[i][0]][thinNums[i][1]]=thinNums[i][2];
    }
    return reThin;
  }

  public static void printArrays(int[][] nums) {
    for (int i = 0; i < nums.length; i++) {
      System.out.println(Arrays.toString(nums[i]));
    }
  }

  public static void main(String[] args) {
    printArrays(nums);
    printArrays(thin(nums));
    printArrays(reThin(thin(nums)));
  }
}
