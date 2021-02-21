package com.kodilla.patterns.strategy.social;

import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        User sandra90 = new YGeneration("sandra90");
        User bonarinn = new ZGeneration("bonarinn");
        User ethan2014 = new Millenials("ethan2014");

        sandra90.share("check this cool place");
        bonarinn.share("freshly done nails");
        ethan2014.share("coding with kodilla");

    }

    @Test
    public void testIndividualSharingStrategy() {
        User brit = new YGeneration("Brit");
        brit.setSocialPublishingStrategy(new SnapchatPublisher());
        brit.share("Done for today ");
    }
}