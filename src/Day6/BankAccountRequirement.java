package Day6;

public class BankAccountRequirement {
    private String name;
    private int age;
    private double transaction;
    private double balance;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if (name.length()>=50){
            throw new IllegalArgumentException("Name cannot be less than 50 characters");
        }
        this.name=name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if (age<18){
            throw new IllegalArgumentException("Age cannot be less than 18");
        }
        this.age=age;

    }
    public double getTransaction() {
        return this.transaction;
    }
    public void setTransaction(double transaction) {
        if (transaction>500000){
            throw new IllegalArgumentException("Transaction cannot be greater than 500000");
        }
        this.transaction=transaction;
    }

    @Override
    public String toString() {
        return "BankAccountRequirement{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", transaction=" + transaction +
                ", balance=" + balance +
                '}';
    }
}
