package lambda;

public class LambdaJava {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {});
        thread.start();
    }
}
