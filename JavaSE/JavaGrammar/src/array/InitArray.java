package array;

/**
 * 数组定义创建赋值
 *
 * @author LiZijing
 * @date 2022/1/23
 */
public class InitArray {
  public static void main(String[] args) {
    // 静态初始化:创建+赋值
    int[] a = {1, 2, 3, 4, 5};
    // 动态初始化:包含默认初始化
    int[] b = new int[5];
    b[0] = 1;
    System.out.println("a[0]:" + a[0]);
    System.out.println("a[1]:" + a[1]);
    //输出 1
    System.out.println("b[0]:" + b[0]);
    //输出 0，int 的默认值为 0
    System.out.println("b[1]:" + b[1]);
  }
}
