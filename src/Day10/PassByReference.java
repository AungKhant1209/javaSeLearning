package Day10;

public class PassByReference {
    public static void updateStudent(Student student){
        student.setName("Minpyaehein");
        student.setAge(28);
        student.setPhone("010-1234-5678");
        System.out.println("Updated Student Info: " + student);

    }
    public static void main(String[] args) {
        Student studentCurrent = new Student("John", 25, "010-1111-2222");
        System.out.println("Before Update: " + studentCurrent);
        updateStudent(studentCurrent);
        System.out.println("After Update: " + studentCurrent);

    }
}
