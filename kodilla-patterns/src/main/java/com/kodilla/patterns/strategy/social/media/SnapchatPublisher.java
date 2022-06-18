package com.kodilla.patterns.strategy.social.media;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String Share() {
        return "[Snapchat Publisher] mainly uses Snapchat";
    }
}
