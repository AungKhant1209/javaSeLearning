package Day7;

public class Employee {
    private String id;
    private String name;
    private String phoneNumber;
    private static String companyName;
    private static int totalEmployeeCount;
    private String position;
    private double salary;


    public Employee(String id, String name, String phoneNumber, String companyName, double salary, String position) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
        this.salary = salary;
        this.position = position;
        totalEmployeeCount++;

    }
    public String toString() {
        return id + " " + name + " " + phoneNumber + " " + companyName + " " + salary + " " + position+" "+totalEmployeeCount;
    }





}
