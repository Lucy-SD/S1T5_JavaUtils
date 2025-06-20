package level1.exercise5;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString () {
        return "Nombre: " + this.name + " .Edad: " + this.age + ".\n";
    }
}
