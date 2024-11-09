package day1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher person1 = new Teacher();
        person1.name = "John Doe";
        person1.age = 20;
        person1.department = "Science";
        person1.phone = "09292983";

        Teacher person2 = new Teacher();
        person2.name = "Alex Kenn";
        person2.age = 24;
        person2.department = "BBA";
        person2.phone = "091234343";

        Teacher person3 = new Teacher();
        person3.name = "Fanny Tiffan";
        person3.age = 21;
        person3.department = "VMS";
        person3.phone = "0945232389";

        System.out.println(person1.name+"  "+person1.age+"  "+person1.department+"  "+person1.phone);
        System.out.println(person2.name+"   "+person2.age+"  "+person2.department+"  "+person2.phone);
        System.out.println(person3.name+"   "+person3.age+"  "+person3.department+"  "+person3.phone);
    }
}
