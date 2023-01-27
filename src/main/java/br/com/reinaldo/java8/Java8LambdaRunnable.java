package br.com.reinaldo.java8;

public class Java8LambdaRunnable {
    public static void main(String [] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                   System.out.println("Ola mundo");
            }
        }).run();

        new Thread(() -> System.out.println("Alo mundo")).run();

    }
}
