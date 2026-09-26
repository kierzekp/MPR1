package org.example;

import org.example.model.Book;
import org.example.model.Person;
import org.example.model.Samples;

import java.util.Random;

public class BooksDistributor {

    public void distributeBooksThroughPeople(){
        for (Person s : Samples.getSampleListOfPeople()) {
            if (!Samples.getAvailableBooks().isEmpty()) {
                int x = getRandomIndex();
                Book randomBook = Samples.getAvailableBooks().get(x);
                if (randomBook.getOwner() == null) {
                    s.addBook(randomBook);
                    randomBook.setOwner(s);
                }

}
        }
    }

    private int getRandomIndex(){
        return new Random().nextInt(0, Samples.getAvailableBooks().size());
    }
}







