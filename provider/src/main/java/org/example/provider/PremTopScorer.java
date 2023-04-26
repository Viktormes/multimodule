package org.example.provider;

import org.example.service.TopScorer;

public class PremTopScorer implements TopScorer {
    @Override
    public String showTopScorer() {
        return "Erling Braut Haaland";
    }
}
