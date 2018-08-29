package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialMedia.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User kid = new ZGeneration("Young User");
        User teen = new YGeneration("Teen User");
        User adult = new Millenials("Adult User");
        //When
        String kidPostsOn = kid.sharePost();
        System.out.println("Kids post on " + kidPostsOn);
        String teenPostsOn = teen.sharePost();
        System.out.println("Teens post on " + teenPostsOn);
        String adultPostsOn = adult.sharePost();
        System.out.println("Adults post on " + adultPostsOn);
        //Then
        Assert.assertEquals("Snapchat", kidPostsOn);
        Assert.assertEquals("Facebook", teenPostsOn);
        Assert.assertEquals("Twitter", adultPostsOn);
    }

    @Test
    public void testIndividualSharingStrategy() { //zmiana upodobań (setUserMedia)
        //Given
        User kid = new ZGeneration("Young User");
        //When
        String kidPostOn = kid.sharePost();
        System.out.println("Kids don't post on " + kidPostOn + " now.");
        kid.setUserMedia(new TwitterPublisher());
        kidPostOn = kid.sharePost();
        System.out.println("Kids post on " + kidPostOn);
        //Then
        Assert.assertEquals("Twitter", kidPostOn);
    }
}
