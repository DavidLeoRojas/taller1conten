package co.edu.uptc.t1contenedores.controller;

import org.springframework.web.bind.annotation.RestController;
import co.edu.uptc.t1contenedores.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/person")
public class PersonController {
    @GetMapping("/all")
    public List<Person> ShowPerson(){
        List<Person> list = new ArrayList<Person>();
        Person person = new Person();
        person.setName("David");
        person.setLastName("Rojas");
        list.add(person);

        person = new Person();
        person.setName("Leonardo");
        person.setLastName("Leon");
        list.add(person);

        return list;
    }

}
