package method;

/**
 * 可变参数
 *
 * @author LiZijing
 * @date 2022/1/17
 */
public class VariableParam {
  public static void main(String[] args) {
    VariableParam variableParam = new VariableParam();
    variableParam.varParams(1, 2, 3);
    variableParam.varParams(new int[] {4, 5, 6});
  }

  public void varParams(int... nums) {
    for (int num : nums) {
      System.out.println(num);
    }
  }
}
