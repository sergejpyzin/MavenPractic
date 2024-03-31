package ru.sergeypyzin;

import ru.sergeypyzin.model.Person;
import ru.sergeypyzin.service.PersonFromJSON;
import ru.sergeypyzin.service.PersonToJSON;

public class App {
    public static void main(String[] args) {

        // создаем экземпляр класса Person
        Person person = new Person("Sergey", "Sergeev", 42);

        // Преобразуем экземпляр класса Person в json-строку
        String jsonString = PersonToJSON.createJSONString(person);

        // Выводим на печать json-строку
        System.out.println(jsonString);

        // Создаем новую json-строку
        String newJsonString = "{\"firstName\":\"Ivan\",\"lastName\":\"Ivanov\",\"age\":30}";

        // Создаем экземпляр класса из json-строки
        Person newPerson = PersonFromJSON.createFromJSON(newJsonString);

        // Выводим на печать экземпляр класса Person
        System.out.println(newPerson);
    }
}