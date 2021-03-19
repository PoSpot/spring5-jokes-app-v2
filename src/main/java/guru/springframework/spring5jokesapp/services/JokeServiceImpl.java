package guru.springframework.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    public String getJoke(){
        return quotes.getRandomQuote();
    }
}
