package processCtrl;

import java.util.Scanner;

/**
 * Scanner
 *
 * @author LiZijing
 * @date 2022/1/16
 */
public class Scan {

  public static void hasNext() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("使用 next 方式接收:");
    if (scanner.hasNext()) {
      System.out.println(scanner.next());
    }
    // 凡是属于 IO 流的类如果不关闭会一直占用资源
    scanner.close();
  }

  public static void nextLine() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("使用 nextLine 方式接收:");
    if (scanner.hasNextLine()) {
      System.out.println(scanner.nextLine());
    }
    // 凡是属于 IO 流的类如果不关闭会一直占用资源
    scanner.close();
  }

  public static void nextIntFloat() {
    Scanner scanner = new Scanner(System.in);
    int i = 0;
    float f = 0.0f;
    System.out.println("输入int数:");
    if (scanner.hasNextInt()) {
      i = scanner.nextInt();
      System.out.println(i);
    } else {
      System.out.println("输入的不是 int");
    }
    //添加 nextLine() 吸收回车，否则第一次输入的 float 数会传递到下面
    scanner.nextLine();
    System.out.println("输入float数:");
    if (scanner.hasNextFloat()) {
      f = scanner.nextFloat();
      System.out.println(f);
    } else {
      // 此处并不会进入，做了类型转换，直接输出了9.0
      System.out.println("输入的不是 float");
    }
    // 凡是属于 IO 流的类如果不关闭会一直占用资源
    scanner.close();
  }

  public static void main(String[] args) {
    nextIntFloat();
  }
}
