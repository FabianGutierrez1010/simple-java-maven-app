package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
        System.out.println("Ingreso commit Ricardo desde mi git clone");
        System.out.println("Ingreso commit Christiam desde mi git clone");
        System.out.println("Realizando un push a la rama remota por Jorge x2");
        System.out.println("Realizando un push a la rama remota por Christiam x2");

    }

    public String getMessage() {
        return MESSAGE;
    }
}
