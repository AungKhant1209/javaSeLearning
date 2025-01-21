package Day9;

import java.util.Scanner;

public class Registeration {
    public static Scanner scanner = new Scanner(System.in);
    public static Student[] students = new Student[90];
    public static String choice;
    public static int index;

    public static void main(String[] args) {
        boolean flag=true;
        do{
            System.out.println("Welcome to the Student Management System");
            System.out.println("Please enter your choice");
            System.out.println("1. Add Student \n"+
                    "2. Display students registered \n"+
                    "3. Update student \n"+
                    "4. Delete student \n"+
                    "5. Exit");
            int choice = scanner.nextInt();scanner.nextLine();
            switch(choice){
                case 1:
                    studentRegister();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    studentUpdate();
                    break;
                case 4:
                    studentDelete();
                    break;
                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }while(flag);


    }

    public static Student getInformation() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Student student = new Student(name, age, phoneNumber);
        return student;
    }

    public static void studentRegister() {
        do {
            Student student = getInformation();
            students[index] = student;
            System.out.println("Do you want to add more student? (yes/no):");
            choice = scanner.nextLine();
            index++;
        } while (choice.equals("yes"));
    }

    public static void studentUpdate() {
        System.out.println("Insert the name of the student: ");
        String searchName = scanner.nextLine();

        int indexUpdate=searchStudent(searchName);
        Student student = getInformation();
        students[indexUpdate] = student;
    }
    public static void deleteProcess(int deleteIndex) {
        while(students[deleteIndex+1] != null) {
            students[deleteIndex]=students[deleteIndex+1];
            deleteIndex++;
        }
        students[deleteIndex]=null;
        index--;

    }
    public static void studentDelete() {
        System.out.println("Delete the student: ");
        String deleteName = scanner.nextLine();
        int indexUpdate = searchStudent(deleteName);
        deleteProcess(indexUpdate);
    }

    public static int searchStudent(String searchName) {
        for (int i = 0; i < index; i++) {
            if (students[i].getName().equals(searchName)) {
                return i;
            }
        }
        return -1;
    }

    public static void displayStudents() {
        for (int i = 0; i < index; i++) {
            students[i].display();
        }
    }
}

