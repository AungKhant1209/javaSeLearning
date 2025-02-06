package Day17.Model;

import java.util.Date;

public class Fish extends Animal{
    public Fish(String name, Date dob, String sex, String color,int age ){
        this.setName(name);
        this.setBirthDate(dob);
        this.setSex(sex);
        this.setColor(color);

    }
}
