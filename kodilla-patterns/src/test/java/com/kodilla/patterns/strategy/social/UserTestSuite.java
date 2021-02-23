package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new YGeneration("Sandra Owczarek");
        User user2 = new ZGeneration("Benedikt Oddsson");
        User user3 = new Millenials("Jenny Heimen");

        //When
        System.out.println("Sandra just posted: " + user1.sharePost());
        System.out.println("Benedikt just posted: " + user2.sharePost());
        System.out.println("Jenny just posted: " + user3.sharePost());

        //Then
        Assert.assertEquals("My 1st Snapchat Story", user1.sharePost());
        Assert.assertEquals("My 1st Facebook Post", user2.sharePost());
        Assert.assertEquals("My 1st Twitter Post", user3.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user = new YGeneration("Karl Svela");

        //When
        System.out.println("Karl just posted: " + user.sharePost());
        user.setSharingPreferences(new FacebookPublisher());
        System.out.println("Karl just posted: " + user.sharePost());

        //Then
        Assert.assertEquals("My 1st Facebook Post", user.sharePost());
    }
}