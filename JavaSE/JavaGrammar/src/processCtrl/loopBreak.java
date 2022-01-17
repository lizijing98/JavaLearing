package processCtrl;

/**
 * 循环中断
 *
 * @author LiZijing
 * @date 2022/1/17
 */
public class loopBreak {
  public static void breakLoop() {
    for (int i = 0; i < 100; i++) {
      System.out.print(i + "\t");
      if (i == 10) {
        break;
      }
    }
  }

  public static void continueLoop() {
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        continue;
      }
      System.out.print(i + "\t");
    }
  }

  public static void labelLoop() {
    for (int j = 0; j < 5; j++) {
      System.out.print(j + "\t");
      a:
      for (int i = 0; i < 10; i++) {
        System.out.print(i + "\t");
        if (i == 5) {
          break a;
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    breakLoop();
    System.out.println();
    continueLoop();
    System.out.println();
    labelLoop();
  }
}
