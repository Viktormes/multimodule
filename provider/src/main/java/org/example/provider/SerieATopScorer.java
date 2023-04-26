package org.example.provider;

import org.example.service.TopScorer;

public class SerieATopScorer implements TopScorer {
    @Override
    public String showTopScorer() {
        return "Victor Osimhen";
    }
}
