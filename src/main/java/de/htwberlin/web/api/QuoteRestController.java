package de.htwberlin.web.api;

import de.htwberlin.service.QuotesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuoteRestController {


    private QuotesService Qu = new QuoteResponse();


    @GetMapping(path = "/api/v1/quotes")
    public ResponseEntity<List<String>> fetchQuotes() {
        return ResponseEntity.ok(Qu.getAllQuotes());
    }


    @GetMapping(path = "/api/v1/quotes/{index}")
    public ResponseEntity<String> fetchQuoteByIndex(@PathVariable int index ){
        return ResponseEntity.ok(Qu.getQuote(index));
    }

}
