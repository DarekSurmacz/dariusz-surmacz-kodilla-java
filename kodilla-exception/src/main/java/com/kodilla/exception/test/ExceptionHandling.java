package com.kodilla.exception.test;

import java.time.LocalDate;

public class ExceptionHandling {

    public static void  main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try { String twoDoubles = secondChallenge.probablyIWillThrowException(2, 1.5);
            System.out.println(twoDoubles);
        } catch (Exception e) {
            System.out.println("Wrong numbers:");
            System.out.println("-first one should be at least 1.0 but smaller than 2.0.");
            System.out.println("-second one shouldn't be equal 1.5");
        } finally {
            System.out.println("New attempt: " + LocalDate.now());
        }
    }
}
