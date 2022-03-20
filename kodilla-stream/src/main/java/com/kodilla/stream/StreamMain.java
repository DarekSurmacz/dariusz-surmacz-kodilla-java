package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

//        //Calculator
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
        //POEM BEAUTIFIER
        System.out.println("\nCalculating expressions with lambdas:");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("A stinky and disgusting poem.", poem -> "$$$ " + poem + " $$$");
        poemBeautifier.beautify("A stinky and disgusting poem.", poem -> "RAINBOW!!! " + poem + " PONNY!!!");
        poemBeautifier.beautify("A stinky and disgusting poem.", poem -> "HELL!!! " + poem + " DESTRUCTION!!!");
        poemBeautifier.beautify("Bad poem", poem -> "Good poem.");
        poemBeautifier.beautify("Bad poem", poem -> String.valueOf(poem.hashCode()));

        System.out.println("\nCalculating expressions with method references:");
        poemBeautifier.beautify("A stinky and disgusting poem.", poemBeautifier::addingWealthInFrontAndBack);
        poemBeautifier.beautify("A disgusting and stinky poem", poemBeautifier::toUpperCase);
        poemBeautifier.beautify("A disgusting and stinky poem", poemBeautifier::toLowerCase);
        poemBeautifier.beautify("    A disgusting and stinky poem.   ", poemBeautifier::trim);
        poemBeautifier.beautify("6", poemBeautifier::repeat616Times);
//
//        //Numbers Generator
//        System.out.println("\nUsing Stream to generate even numbers from 1 to 20:");
//        NumbersGenerator.generateEven(20);

//        //People
//        People.getList().stream()
//                .map(String::toUpperCase)                             // [1]
//                .filter(s -> s.length() > 11)                         // [2]
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")   // [3] Imię i pierwsza litera nazwiska
//                .filter(s -> s.substring(0, 1).equals("M"))           // [4]
//                .forEach(System.out::println);                        // [5]
//
//        System.out.println();

//        //Book
//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
//                .forEach(System.out::println);

        //ForumUser
        final Forum forum = new Forum();

        Map<String, ForumUser> theResultListOfUsers = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getAge() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultListOfUsers.size());
        theResultListOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}