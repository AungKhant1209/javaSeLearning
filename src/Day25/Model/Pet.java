package Day25.Model;

import Day25.Util.DataUtil;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pet {
    private static List<Pet> pets=new ArrayList<>();
    static{
        try {
            pets.add(new Pet("Crystal","25252",3,"Cat", DataUtil.stringToDateConvector("01/02/2021"),"Wai Yan"));
            pets.add(new Pet("Taza","25251",3,"Cat", DataUtil.stringToDateConvector("01/02/2021"),"Wai Yan"));
            pets.add(new Pet("SweetMa","25253",4,"Cat", DataUtil.stringToDateConvector("01/02/2021"),"Felix"));
            pets.add(new Pet("Milo","25253",4,"Cat", DataUtil.stringToDateConvector("01/02/2021"),"Felix"));
            pets.add(new Pet("Ni Ma","25253",4,"Cat", DataUtil.stringToDateConvector("01/02/2021"),"Aung Khant"));
            pets.add(new Pet("Lazy Girl","25253",4,"Cat", DataUtil.stringToDateConvector("01/02/2021"),"Aung Khant"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    private String name;
    private String licen;
    private int age;
    private String species;
    private Date dob;
    private String owner;
    public Pet(){

    }
    public Pet(String name, String licen, int age, String species, Date dob, String owner) {
        this.name = name;
        this.licen = licen;
        this.age = age;
        this.species = species;
        this.dob = dob;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicen() {
        return licen;
    }

    public void setLicen(String licen) {
        this.licen = licen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public static List<Pet> getPets() {
        return pets;
    }

    public static void add(Pet pet){
        pets.add(pet);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", licen='" + licen + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", dob=" + dob +
                ", owner='" + owner + '\'' +
                '}';
    }


}
