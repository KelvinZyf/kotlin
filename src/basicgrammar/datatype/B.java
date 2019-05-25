package basicgrammar.datatype;

public class B {

    public static void main(String[] args) {

        A a = new A();
        a.putNumber(123);
        a.putNumber(new Integer(123));

        Test.staticMethod();
    }
}
