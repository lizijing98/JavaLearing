package base;

/**
 * 数据类型
 *
 * @author LiZijing
 * @date 2022/1/15
 */
public class TypeOfData {

  /**
   * 八大基本数据类型定义
   *
   * @author LiZijing
   * @date 2022/1/15
   */
  public static void init() {
    // 八大基本数据类型

    // 整数
    int num1 = 10;
    byte num2 = 127;
    short num3 = 30;
    // long 类型要在数字后加 L
    long num4 = 50L;

    // 小数
    // float 类型要在数字后加 F
    float num5 = 1.5F;
    double num6 = 3.14159265359;

    // 字符
    char char1 = 'L';

    // 字符串
    // String 不是关键字而是一个类
    String str = "LL_Ricky";

    // 布尔
    boolean flag = true;
  }

  /**
   * 整数浮点数扩展
   *
   * @author LiZijing
   * @date 2022/1/15
   */
  public static void num1() {
    /* 整数拓展 进制：二进制 0b，十进制，八进制 0，十六进制 0x */
    int i1 = 10;
    // 二进制 0b 开头，输出 2
    int i2 = 0b10;
    // 八进制 0 开头，输出 8
    int i3 = 010;
    // 十六进制 0x 开头，输出 16，0-9A-F
    int i4 = 0x10;

    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println(i4);

    /** 浮点数拓展 */
    float f = 0.1f; // 0.1
    double d = 1.0 / 10; // 0.1

    System.out.println(f);
    System.out.println(d);
    // 返回 false
    System.out.println(f == d);

    float d1 = 231234124f;
    float d2 = d1 + 1;
    // 返回 true
    System.out.println(d1 == d2);
  }

  /**
   * 字符扩展
   *
   * @author LiZijing
   * @date 2022/1/15
   */
  public static void char1() {
    char c1 = 'a';
    char c2 = '中';
    // 输出 a
    System.out.println(c1);
    // 输出 97，a 的 Unicode 码值
    System.out.println((int) c1);
    // 输出 中
    System.out.println(c2);
    // 输出 20013
    System.out.println((int) c2);
    // 输出 a，Unicode 表示范围:\u0000 ~ \uFFFF
    System.out.println('\u0061');
    /* 转义字符: \t:制表符 \n:换行... */
  }

  /**
   * 字符串扩展
   *
   * @author LiZijing
   * @date 2022/1/15
   */
  public static void str1() {
    String sa = new String("hello");
    String sb = new String("hello");
    // 输出 false，两个不同的变量对象
    System.out.println(sa == sb);
    String sc = "hello";
    String sd = "hello";
    // 输出 true，两个不同的常量，但都在常量池中
    System.out.println(sc == sd);
  }

  /**
   * 布尔类型扩展
   *
   * @author LiZijing
   * @date 2022/1/15
   */
  public static void bool1() {
    boolean flag = true;
    if (flag) {}
    // ==if(flag==true){}
  }

  public static void main(String[] args) {
    str1();
  }
}
