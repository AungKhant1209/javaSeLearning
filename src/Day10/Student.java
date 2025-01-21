package Day10;

public class Student {
    public static final int MAX_STUDENTS = 10000;
    private String name;
    private int age;
    private String phone;
    public static int totalStudentCount = -1;
    private static Student[] students = new Student[MAX_STUDENTS];
    public Student(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        totalStudentCount++;
    }

    public static Student[] getStudents() {
        return students;
    }

    public static void setStudents(Student[] students) {
        Student.students = students;
    }
    public static void addStudent(Student student) {
        Student.students[totalStudentCount] = student;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Student getStudentByName(String studentName) {
        for (int i = 0; i < totalStudentCount; i++) {
            if (students[i].getName().equals(studentName)) {
                return students[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }


}
