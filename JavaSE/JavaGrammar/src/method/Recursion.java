package method;

/**
 * 递归
 *
 * @author LiZijing
 * @date 2022/1/17
 */
public class Recursion {
  public static void main(String[] args) {
    Recursion recursion = new Recursion();
    System.out.println(recursion.factorial(10));
  }

  public int factorial(int n) {
    if (n <= 0) {
      return -1;
    } else if (n <= 2) {
      return n;
    } else {
      return n * factorial(n - 1);
    }
  }
}
