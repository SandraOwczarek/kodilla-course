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
        String user1Publisher = user1.sharePost();
        String user2Publisher = user2.sharePost();
        String user3Publisher = user3.sharePost();

        //Then
        Assert.assertEquals("My 1st Snapchat Story", user1.sharePost());
        Assert.assertEquals("My 1st Facebook Post", user2.sharePost());
        Assert.assertEquals("My 1st Twitter Post", user3.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new YGeneration("Sandra Owczarek");
        User user2 = new ZGeneration("Benedikt Oddsson");
        User user3 = new Millenials("Jenny Heimen");

        //When
        user1.setSocialPublisher(new TwitterPublisher());
        user2.setSocialPublisher(new SnapchatPublisher());
        user3.setSocialPublisher(new FacebookPublisher());
        String user1Publisher = user1.sharePost();
        String user2Publisher = user2.sharePost();
        String user3Publisher = user3.sharePost();
        //Then
        Assert.assertEquals("My 1st Twitter Post", user1Publisher);
        Assert.assertEquals("My 1st Snapchat Story", user2Publisher);
        Assert.assertEquals("My 1st Facebook Post", user3Publisher);
    }
}