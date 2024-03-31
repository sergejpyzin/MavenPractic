package ru.sergeypyzin.service;

import com.google.gson.Gson;
import ru.sergeypyzin.model.Person;

public class ObjectToJSON {

    private static final Gson gson = new Gson();

    public static String createJSONString (Person person){
        return gson.toJson(person);
    }
}
