package com.stark.patterns.structural.proxy;

public class Main {
    public static void main(String args[]) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeline("tnf_stark"));

        service.postToTimeline("tnf_stark", "Hello world!");
    }
}
