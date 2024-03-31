package ru.sergeypyzin.service;

import com.google.gson.Gson;
import ru.sergeypyzin.model.Person;

public class PersonToJSON {

    private static final Gson gson = new Gson();


    /**
     * Метод преобразования объекта типа Person в строку JSON с использованием библиотеки Gson.
     * - Метод toJson() библиотеки Gson принимает объект типа Person и преобразует его в строку JSON.
     * - Эта JSON-строка содержит поля объекта Person в формате ключ-значение, соответствующем структуре класса Person.
     * Например, если класс Person имеет поля firstName, lastName и age, то возвращенная JSON-строка будет выглядеть примерно так:
     * {
     *   "firstName": "John",
     *   "lastName": "Doe",
     *   "age": 30
     * }
     *
     * @param person объект класса Person
     *
     * @return преобразованный в JSON-строку объект класса Person
     */
    public static String createJSONString (Person person){
        return gson.toJson(person);
    }
}
