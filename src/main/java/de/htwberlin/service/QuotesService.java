package de.htwberlin.service;

import de.htwberlin.web.api.QuoteResponse;

import java.util.List;

public interface QuotesService  {

  /**
   * The method returns a selected Chuck Norris quote from the QUOTES list.
   * @param index - Determines which quote to choose from the list.
   * @throws IllegalArgumentException - Throws IllegalArgumentException if index is out of range.
   * @return The chosen Chuck Norris quote.
   */
  String getQuote(int index);

  List<String> getAllQuotes();


}

