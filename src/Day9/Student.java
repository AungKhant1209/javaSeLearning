package Day9;

public class Student {

    private String name;
    private int age;
    private String phoneNumber;
    public static int i;
    public Student(String nameParam, int ageParam, String phoneNumberParam) {
        this.name = nameParam;
        this.age = ageParam;
        this.phoneNumber = phoneNumberParam;
        i++;
    }
    public void display(){
        System.out.println("                     ");
        System.out.println("Student" +">>>>");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("          ");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
