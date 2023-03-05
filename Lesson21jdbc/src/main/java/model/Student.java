package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Student {
    private City city;
    private int id;
    private String name;
    private String surname;
    private int age;
    private int course;


    public Student(City city, int id, String name, String surname, int age, int course) {
        this.city = city;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
    }
}
