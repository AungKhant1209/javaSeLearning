package Day8;

import java.util.Scanner;

public class UseStudent {
    public  static Scanner scanner = new Scanner(System.in);
    public static int numberOfStudents;
    public static  Student[] students=new Student[20];
    public static void main(String[] args) {
        studentRegister();
        displayStudents();
    }

    public static void studentRegister(){

        System.out.println("Enter numberofStudents: ");
        numberOfStudents = scanner.nextInt();scanner.nextLine();
        int index=0;
        while(index<numberOfStudents){
            System.out.println("Enter student information For Student: "+(index+1));
            Student student=getStudentInfo();
            students[index]=student;
            index++;
        }
    }
    public static void displayStudents(){
        for(int i=0;i<numberOfStudents;i++){
            System.out.println(students[i]);
        }
    }

    public static Student getStudentInfo(){
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Student student=new Student(name, age,phoneNumber );
        return student;
    }
}
