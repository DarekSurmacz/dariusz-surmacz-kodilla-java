package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania.");
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int addingResult = calculator.add(0, 1);
        int subtractResult = calculator.subtract(0, 1);

        if (addingResult == 1) {
            System.out.println("adding test OK");
        } else {
            System.out.println("adding Error!");
        }

        if (subtractResult == -1) {
            System.out.println("subtracting test OK");
        } else {
            System.out.println("subtracting Error!");
        }

    }
}