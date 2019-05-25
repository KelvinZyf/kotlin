package preadfunction;

public class MainClass {

    public static void main(String[] args) {

        // Java中调用Kotlin中定义的扩展函数
        MethodClass methodClass = new MethodClass();
        // 参数一：代表的是扩展方法是那个类的  参数二：正常参数
        ExtendMethodClassKt.extendTest(methodClass, "Java中调用Kotlin的扩展函数");

        System.out.println(ExtendMethodClassKt.getDate(methodClass));
    }
}
