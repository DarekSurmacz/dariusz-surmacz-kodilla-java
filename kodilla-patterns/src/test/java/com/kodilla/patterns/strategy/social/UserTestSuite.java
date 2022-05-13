package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User darek = new Millenials("Darek");
        User basia = new YGeneration("Basia");
        User zyraf = new ZGeneration("Żyraf");

        //When
        String darekShouldShare = darek.sharePost();
        System.out.println(darek.getName() + " " + darekShouldShare);
        String basiaShouldShare = basia.sharePost();
        System.out.println(basia.getName() + " " + basiaShouldShare);
        String zyrafShouldShare = zyraf.sharePost();
        System.out.println(zyraf.getName() + " " + zyrafShouldShare);

        //Then
        Assertions.assertEquals("Facebook", darekShouldShare);
        Assertions.assertEquals("Snapchat", basiaShouldShare);
        Assertions.assertEquals("Twitter", zyrafShouldShare);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User darek = new Millenials("Darek");

        //When
        String darekShouldShare = darek.sharePost();
        System.out.println(darek.getName() + " " + darekShouldShare);
        darek.setSocialPublisher(new TwitterPublisher());
        darekShouldShare = darek.sharePost();
        System.out.println(darek.getName() + " " + darekShouldShare);


        //Then
        Assertions.assertEquals("Twitter", darekShouldShare);
    }
}
