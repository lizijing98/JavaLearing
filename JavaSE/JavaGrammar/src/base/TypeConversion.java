package base;

/**
 * 类型转换
 *
 * @author LiZijing
 * @date 2022/1/15
 */
public class TypeConversion {

  public static void trans() {
    /*
    注意点：
    1.不能对布尔值进行转换
    2.不能把对象类型转换为不相干的类型
    3.在把高容量转换为低容量的时候，强制转换
    4.转换的时候可能存在内存溢出或精度问题
    */
    int i = 128;
    byte b = (byte) i;
    double d = i;
    System.out.println(i);
    // 输出 -128，128 大于 byte 类型容量产生内存溢出
    System.out.println(b);
    System.out.println(d);
    System.out.println((int) 23.7);
    System.out.println((int) -45.89f);
  }

  public static void overflow() {
    int money = 10_0000_0000;
    int year = 20;
    int total = money * year;
    // 不行，计算时以 int 型计算，已经产生了溢出
    long total1 = money * year;
    // 以下两种方式可以
    long total2 = money * ((long) year);
    long total3 = (long) money * year;
    // 输出-1474836480，产生溢出
    System.out.println(total);
    System.out.println(total1);
    System.out.println(total2);
    System.out.println(total3);
  }

  public static void main(String[] args) {
    overflow();
  }
}
