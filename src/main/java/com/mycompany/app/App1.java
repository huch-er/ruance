package com.mycompany.app;

/**
 * Hello world!
 */
public class App1
{

    private final String message = "Hello World!";

    public App1() {}

    public static void main(String[] args) {
        System.out.println(new App1().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
