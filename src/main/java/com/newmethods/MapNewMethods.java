package com.newmethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapNewMethods {

    List<Person> retrievePeople() {
        Map<Integer, Person> personMap = new HashMap<>();
        List<Person> people = new ArrayList<>();

        personMap.put(1, new Person("Artemas", "Muzanenhamo"));
        personMap.put(2, new Person("John", "Smith"));

        personMap.forEach((key, person) -> people.add(person));

        return people;
    }

    Person getPerson(Map<Integer, Person> personMap) {
        Person person = Person.DEFAULT_PERSON;
        Map<Integer, Person> map = new HashMap<>();
        map.put(2, person);

        return map.getOrDefault(personMap.get(1), person);
    }

    public Map<Integer, Person> getPeople() {
        Person person = new Person("Artemas", "Muzanenhamo");
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, person);
        personMap.putIfAbsent(2, new Person("Jimmy", "Butler"));

        return personMap;
    }

    Map<Integer, Person> replacePerson(Map<Integer, Person> person) {
        person.replace(1, new Person("Artemas", "Muzanenhamo"));
        return person;
    }

    Map<Integer, Person> replaceOldPersonWithNewPerson(Map<Integer, Person> person) {
        person.replace(1, person.get(1),  new Person("Artemas", "Muzanenhamo"));
        return person;
    }

    Map<Integer, Person> replaceAllPeople(Map<Integer, Person> person) {
        person.replaceAll( (key, oldPerson) -> new Person("Artemas", "Muzanenhamo") );
        return person;
    }

    Map<Integer, Person> removeAPerson(int key, Map<Integer, Person> people) {
        people.remove(key);
        return people;
    }

    Map<Integer, Person> removeAPersonWithValue(int key, Map<Integer, Person> people) {
        people.remove(key, people.get(key));
        return people;
    }

    Map<Integer, Person> mergePeople(Map<Integer, Person> people) {
        people.merge(3, people.get(3), (key, person) -> new Person("John", "Doe"));
        people.merge(4, people.getOrDefault(4, new Person("Lebron", "James")), (key, person) -> new Person("Lebron", "James"));
        return people;
    }
}
