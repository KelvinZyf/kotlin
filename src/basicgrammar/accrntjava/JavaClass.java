package basicgrammar.accrntjava;


public class JavaClass {

    public static String in = "in";

    public static void main(String[] args) {


        // java 调用Kotlin方法
        UtilsKt.echo("hello Kotlin");
        /***
         * 使用UtilsKt 可以调用的原因是，Kotlin在编译的时候，把方法编译成了Public static  UtilsKt这个类名是可以更改的
         */

        // java 调用Kotlin文件的内部类
        Test.INSTANCE.sayMessage("hello Kotlin 内部类");

        // 重新命名Kotlin文件名字
        KotlinDo.doSomething();
    }

    public void addValue() {
        System.out.println("Java方法");
    }

    public static void addValue1() {
        System.out.println("Java方法1");
    }
}
