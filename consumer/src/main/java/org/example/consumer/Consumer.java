package org.example.consumer;

import org.example.service.TopScorer;

import java.util.ServiceLoader;

public class Consumer {

    public static void main(String[] args) {


        ServiceLoader<TopScorer> topScorers = ServiceLoader.load(TopScorer.class);

        for (var topScorer: topScorers) {
            System.out.println(topScorer.showTopScorer());

        }


    }
}
