package ru.sergeypyzin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String firstName;

    private String lastName;

    private int age;


    /**
     * Переопределение метода toString() класса Object с помощью библиотеки Apache Commons Lang
     * - Создается строковое представление объекта, используя метод reflectionToString(),
     * который принимает текущий объект (this) в качестве аргумента.
     * - Второй аргумент ToStringStyle.JSON_STYLE указывает на стиль форматирования,
     * который будет использован при создании строки. В данном случае, JSON_STYLE означает, что созданная строка
     * будет похожа на JSON-объект.
     *
     * @return json представление объекта
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

    /**
     * Получение хеш-кода объекта с помощью библиотеки Apache Commons Lang
     * - Создается новый объект HashCodeBuilder с параметрами 5 и 25.
     * Эти параметры используются для инициализации внутренних переменных внутри HashCodeBuilder.
     * Они могут влиять на результат хеш-кода, и изменение этих значений может изменить распределение хеш-кодов,
     * что может быть полезно для оптимизации, если это необходимо.
     * - Затем для созданного объекта HashCodeBuilder вызываются методы append(), в которые передаются
     * поля объекта (firstName, lastName, age). Это означает, что значения этих полей будут использованы при вычислении хеш-кода.
     * - Наконец, вызывается метод toHashCode(), который вычисляет и возвращает окончательное значение хеш-кода
     * на основе переданных полей.
     *
     * @return хеш-код объекта
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder(5, 25)
                .append(firstName)
                .append(lastName)
                .append(age)
                .toHashCode();
    }


    /**
     * Переопределение метода equals класса Object с помощью библиотеки Apache Commons Lang
     * - Сначала проверяется ссылается ли переданный объект на тот же самый объект (this),
     * если да, то метод возвращает true, потому что объекты являются одним и тем же.
     * - Затем проверяется, является ли переданный объект null или не относится ли к тому же классу,
     * что и текущий объект. Если это так, метод возвращает false, потому что объекты, которые не относятся к тому же классу,
     * не могут быть равны.
     * - Затем создается новый объект EqualsBuilder. Этот класс также принадлежит библиотеке Apache Commons Lang.
     * Метод append() используется для сравнения полей текущего объекта с полями объекта person (который приведен к типу Person).
     * Это позволяет сравнить каждое поле объекта на равенство.
     * - Наконец, вызывается метод isEquals(), который возвращает булево значение, указывающее на то, равны ли объекты
     * по заданным полям.
     * @param obj - принимает на вход экземпляр класса Object с которым проводится сравнение.
     *
     * @return - булево значение, указывающее на то, равны ли объекты по заданным полям (true/false)
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        return new EqualsBuilder()
                .append(age, person.age)
                .append(firstName, person.firstName)
                .append(lastName, person.lastName)
                .isEquals();
    }
}
