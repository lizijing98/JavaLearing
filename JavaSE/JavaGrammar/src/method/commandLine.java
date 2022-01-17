package method;

/**
 * 命令行传参
 *
 * @author LiZijing
 * @date 2022/1/17
 */
public class commandLine {
  public static void main(String[] args) {
    for (String arg : args) {
      System.out.println(arg);
    }
  }
}
