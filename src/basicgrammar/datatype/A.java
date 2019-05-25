package basicgrammar.datatype;

public class A implements AInterface {

    @Override
    public void putNumber(int Num) {
        System.out.println("int 类型");
    }

    @Override
    public void putNumber(Integer Num) {
        System.out.println("Integer 类型");
    }

    public static String format(String s) {

        return s.isEmpty() ? null : s;
    }
}
