import org.example.service.TopScorer;

module org.example.consumer {
    requires org.example.service;
    uses org.example.service.TopScorer;
}