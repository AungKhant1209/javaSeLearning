package Day15.Model;

public class Teacher {
    public static final int MAX_TEACHERS = 10000;
    private static Teacher[] teachers = new Teacher[MAX_TEACHERS];
    private String name;
    private int age;
    private String phone;
    private String department;
    private String position;
    private String address;
    private String subject;
    private static int totalTeacherCount;

    public Teacher(String name, int age, String phone, String department, String position, String address, String subject) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.department = department;
        this.position = position;
        this.address = address;
        this.subject = subject;
    }
    public static void addTeacher(Teacher teacher) {
        Teacher.teachers[totalTeacherCount] = teacher;
    }
    public static Teacher getTeacherByName(String studentName) {
        for (int i = 0; i < totalTeacherCount; i++) {
            if (teachers[i].getName().equals(studentName)) {
                return teachers[i];
            }
        }
        return null;
    }

    public static Teacher[] getTeachers() {
        return teachers;
    }

    public static void setTeachers(Teacher[] teachers) {
        Teacher.teachers = teachers;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static int getTotalTeacherCount() {
        return totalTeacherCount;
    }

    public static void setTotalTeacherCount(int totalTeacherCount) {
        Teacher.totalTeacherCount = totalTeacherCount;
    }
}
