package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.FacebookPublisher;
import com.kodilla.patterns.strategy.social.media.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User Karol = new Millenials("Karol X");
        User Jula = new YGeneration("Jula Y");
        User Basia = new ZGeneration("Basia Z");

        //When
        String karolShare = Karol.sharePost();
        System.out.println("karol " + karolShare);
        String julaShare = Jula.sharePost();
        System.out.println("Jula " + julaShare);
        String basiaShare = Basia.sharePost();
        System.out.println("Basia " + basiaShare);

        //Then
        assertEquals("[Twitter Publisher] mainly uses Twitter", karolShare);
        assertEquals("[Facebook Publisher] mainly uses Facebook", basiaShare);
        assertEquals("[Snapchat Publisher] mainly uses Snapchat", julaShare);
    }
    @Test
    void testIndividualSharingStrategy() {
        //Given
        User krzysiek= new YGeneration("Krzysiek");

        //When
        String krzysiekShare = krzysiek.sharePost();
        System.out.println("Krzysiek " + krzysiekShare);
        krzysiek.setSocialPublisher(new FacebookPublisher());
        krzysiekShare = krzysiek.sharePost();
        System.out.println("Krzysiek now " + krzysiekShare);

        //Then
        assertEquals("[Facebook Publisher] mainly uses Facebook", krzysiekShare);
    }
}
