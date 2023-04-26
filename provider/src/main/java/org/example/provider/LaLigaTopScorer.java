package org.example.provider;

import org.example.service.TopScorer;

public class LaLigaTopScorer implements TopScorer {
    @Override
    public String showTopScorer() {
        return "Robert Lewandowski";
    }
}
