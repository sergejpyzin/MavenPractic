# Описание проекта

Проект содержит классы для работы с объектами типа Person, а также сервисы для преобразования объектов в формат JSON и обратно.

## Класс Person

Класс `Person` представляет собой модель человека и содержит информацию о его имени, фамилии и возрасте.

### Поля класса Person:

- `firstName` (String): Имя человека.
- `lastName` (String): Фамилия человека.
- `age` (int): Возраст человека.

### Методы класса Person:

- `toString()`: Переопределенный метод для создания JSON-представления объекта.
- `hashCode()`: Переопределенный метод для вычисления хеш-кода объекта.
- `equals(Object obj)`: Переопределенный метод для сравнения объектов.
  
## Сервисы для работы с JSON

### `PersonFromJSON`

Сервис `PersonFromJSON` предоставляет метод `createFromJSON`, который преобразует JSON-строку в объект класса Person.

### `PersonToJSON`

Сервис `PersonToJSON` содержит метод `createJSONString`, который преобразует объект класса Person в JSON-строку.

## Использование

Для использования сервисов преобразования объектов в JSON и обратно, необходимо создать экземпляры классов `PersonFromJSON` и `PersonToJSON` и вызвать соответствующие методы.

```java
// Пример использования сервиса для преобразования JSON в объект Person
String jsonString = "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"age\":30}";
Person person = PersonFromJSON.createFromJSON(jsonString);

// Пример использования сервиса для преобразования объекта Person в JSON
String jsonOutput = PersonToJSON.createJSONString(person);
```

## Требования к зависимостям
Для использования проекта необходимо иметь следующие зависимости:

* Библиотека Lombok для удобного создания геттеров, сеттеров и других стандартных методов класса.

* Библиотека Apache Commons Lang для работы с методами toString(), hashCode() и equals().

* Библиотека Gson для работы с JSON.

``` xml
  <dependencies>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.32</version>
    </dependency>
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
        <version>3.14.0</version>
    </dependency>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
</dependencies>
```
