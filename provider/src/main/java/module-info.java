import org.example.provider.BundesligaTopScorer;
import org.example.provider.LaLigaTopScorer;
import org.example.provider.PremTopScorer;
import org.example.provider.SerieATopScorer;
import org.example.service.TopScorer;

module org.example.provider {
    requires org.example.service;
    provides TopScorer with PremTopScorer, SerieATopScorer,BundesligaTopScorer,LaLigaTopScorer;
}