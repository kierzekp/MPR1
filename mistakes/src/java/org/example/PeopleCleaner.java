package org.example;

import org.example.model.Person;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class PeopleCleaner {

    public List<Person> getPeopleWithBooksOnly(List<Person> people){
        List<Person> newList = new ArrayList<>(people);
        for (Person person : people) {
            if (person.getBooks().isEmpty())
                newList.remove(person);
        }
        return newList;
    }
}
