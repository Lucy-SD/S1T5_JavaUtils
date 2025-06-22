package level1.exercise5;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString () {
        return "Nombre: " + this.name + " .Edad: " + this.age + ".\n";
    }
}
