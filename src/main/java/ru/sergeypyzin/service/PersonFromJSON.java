package ru.sergeypyzin.service;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import ru.sergeypyzin.model.Person;

public class PersonFromJSON {

    private final static Gson gson = new Gson();


    /**
     * Этот метод из библиотеки Gson, которая используется для преобразования JSON-строки в объект Java.
     * - gson.fromJson(jsonString, Person.class) используется для преобразования JSON-строки jsonString в объект класса Person.
     * Метод fromJson() библиотеки Gson принимает два аргумента: JSON-строку и класс, в который нужно преобразовать эту строку.
     * - После преобразования JSON-строки в объект Java, этот объект возвращается из метода.
     *
     * @param jsonString JSON-строка для преобразования в объект класса Person
     *
     * @return объект класса Person
     */
    public static Person createFromJSON(String jsonString) {

        try {

            return gson.fromJson(jsonString, Person.class);

        } catch (JsonSyntaxException e) {

            // Обработка исключения, если преобразование невозможно
            System.err.println(e.getMessage()); // Вывод информации об ошибке в консоль

            return null;
        }
    }
}
