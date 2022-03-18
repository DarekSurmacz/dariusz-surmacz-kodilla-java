package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

//POEM BEAUTIFIER
        System.out.println();
        System.out.println("Calculating expressions with lambdas:");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("A stinky and disgusting poem.", (poem) -> "$$$ " + poem + " $$$");
        poemBeautifier.beautify("A stinky and disgusting poem.", (poem) -> "RAINBOW!!! " + poem + " PONNY!!!");
        poemBeautifier.beautify("A stinky and disgusting poem.", (poem) -> "HELL!!! " + poem + " DESTRUCTION!!!");
        poemBeautifier.beautify("Bad poem", (poem) -> "Good poem.");
        poemBeautifier.beautify("Bad poem", (poem) -> String.valueOf(poem.hashCode()));
        poemBeautifier.beautify("A stinky and disgusting poem.", (poem) -> poem.toUpperCase());
        poemBeautifier.beautify("A stinky and disgusting poem.", (poem) -> poem.toLowerCase());

        System.out.println();
        System.out.println("Calculating expressions with method references:");
        poemBeautifier.beautify("A stinky and disgusting poem.", poemBeautifier::addingWealthInFrontAndBack);
        poemBeautifier.beautify("A disgusting and stinky poem", poemBeautifier::toUpperCase);
        poemBeautifier.beautify("    A disgusting and stinky poem.   ", poemBeautifier::trim);
        poemBeautifier.beautify("6", poemBeautifier::repeat616thTimes);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}