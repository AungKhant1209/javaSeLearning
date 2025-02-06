package Day17.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
    private  String name;
    private Date birthDate;
    private int age;
    private int species;
    private String color;
    private String sex;
    private String speak;

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public String getSpeak() {
        return speak;
    }

    public Animal(){
        System.out.println("....");
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(int species) {
        this.species = species;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {

        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
