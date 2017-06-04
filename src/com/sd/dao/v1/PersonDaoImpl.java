package com.sd.dao.v1;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
    List<Person> persons;
    public PersonDaoImpl() {
        persons = new ArrayList<Person>();
        Person p1 = new Person(0,"paper1");
        Person p2 = new Person(1,"paper2");
        persons.add(p1);
        persons.add(p2);           
    }
    public void deletePerson(Person p) {
        persons.remove(p.getId());
        System.out.println("deleting... "+p.getId());
    }
    public List<Person> getAllPersons() {
        return persons;
    }
    public Person getPerson(int rollNo) {
        return persons.get(rollNo);
    }
    public void updatePerson(Person person) {
        persons.get(person.getId()).setName(person.getName());
        System.out.println("updating... "+person.getId());
    }
}