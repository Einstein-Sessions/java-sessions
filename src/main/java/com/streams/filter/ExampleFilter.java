package com.streams.filter;

import com.streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleFilter {
    private List<Person> listOfPeople() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Artemas", 28));
        persons.add(new Person("Tom", 40));
        persons.add(new Person("Matt", 16));
        persons.add(new Person("Shawn", 15));
        persons.add(new Person("James", 18));

        return persons;
    }

    public List<Person> peopleOver20 () {
        return listOfPeople().stream()
                .filter(person -> person.getAge() > 20) // Our Predicate is here within the filter() method.
                .collect(Collectors.toList());
    }
}