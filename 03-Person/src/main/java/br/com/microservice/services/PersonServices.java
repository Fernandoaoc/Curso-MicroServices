package br.com.microservice.services;

import br.com.microservice.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    public Person createPerson(Person person){

        return person;
    }

    public Person update(Person person){

        return person;
    }

    public void delete(String id){
    }

    public Person findById(String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Fernando");
        person.setLastName("Coelho");
        person.setAddress("Ouro Branco - MG - Br");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll(){
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person mockPerson(int i){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person Name" + i);
        person.setLastName("Last Name" + i);
        person.setAddress("Some Address in Brazil");
        person.setGender("Male");
        return person;
    }

}
