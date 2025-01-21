package Day17.Model;

import Day17.Service.BirdService;

import java.util.Date;

public class Bird extends Animal{
    public Bird(String name, Date dob, String sex, String color,int age){
        this.setName(name);
        this.setBirthDate(dob);
        this.setSex(sex);
        this.setColor(color);
        this.setAge(age);

    }


}
