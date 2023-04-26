package org.example.provider;

import org.example.service.TopScorer;

public class BundesligaTopScorer implements TopScorer {
    @Override
    public String showTopScorer() {
        return "Niclas Füllkrug";
    }
}
