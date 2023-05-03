package org.example.consumer;

import org.example.service.TopScorer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Consumer {

    static List<TopScorer> topScorerList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceLoader<TopScorer> topScorers = ServiceLoader.load(TopScorer.class);

        for (var topScorer: topScorers) {
            topScorerList.add(topScorer);
        }
        menuChoices();
        chooseTopScorer(sc);
    }

    private static void chooseTopScorer(Scanner sc) {
        String choice = sc.nextLine();
        boolean loop = true;

        while (loop) {
            switch (choice) {
                case "1" -> System.out.println(topScorerList.get(0).showTopScorer());
                case "2" -> System.out.println(topScorerList.get(1).showTopScorer());
                case "3" -> System.out.println(topScorerList.get(2).showTopScorer());
                case "4" -> System.out.println(topScorerList.get(3).showTopScorer());
                case "5" -> loop = false;
                default -> menuChoices();
            }
            choice = sc.nextLine();
        }
    }

    private static void menuChoices() {
        int add = 1;
        System.out.println("Please choose a league.");
        for (var topScorerMenu: topScorerList) {
            System.out.println(add + ". " + topScorerMenu.getClass().getSimpleName());
            add++;
        }
        System.out.println("5. Exit");
    }
}
