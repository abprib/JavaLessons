package Lesson8.Serialization;

import java.io.Serializable;

public class User implements Serializable {
    int age;
    String name;
    User(int a, String n){
        age = a;
        name = n;
    }
}
