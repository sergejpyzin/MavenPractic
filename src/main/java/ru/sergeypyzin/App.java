package ru.sergeypyzin;

import ru.sergeypyzin.model.Person;
import ru.sergeypyzin.service.PersonFromJSON;
import ru.sergeypyzin.service.PersonToJSON;

public class App {
    public static void main(String[] args) {

        Person person = new Person("Sergey", "Sergeev", 42);

        String jsonString = PersonToJSON.createJSONString(person);

        System.out.println(jsonString);

        String newJsonString = "{\"firstName\":\"Ivan\",\"lastName\":\"Ivanov\",\"age\":30}";

        Person newPerson = PersonFromJSON.createFromJSON(newJsonString);

        System.out.println(newPerson);
    }
}