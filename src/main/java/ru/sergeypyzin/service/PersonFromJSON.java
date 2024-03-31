package ru.sergeypyzin.service;

import com.google.gson.Gson;
import ru.sergeypyzin.model.Person;

public class PersonFromJSON {

    private final static Gson gson = new Gson();


    public static Person createFromJSON(String jsonString) {

        return gson.fromJson(jsonString, Person.class);
    }
}
