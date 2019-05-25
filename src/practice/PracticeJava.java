package practice;


public class PracticeJava {

    public static void main(String[] args) {

//        Test.INSTANCE 无法调用Kotlin中使用@JvmStatic注释的方法
        Test.sayMessage(null);
    }
}
