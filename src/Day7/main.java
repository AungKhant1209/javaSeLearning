package Day7;


public class main {
    public static void main(String[] args) {
        Employee employee= new Employee("12", "aung","123344","AK",12,"manager");
        System.out.println(employee);
        Employee employee2= new Employee("1.2", "au.ng","12.3344","AK",12,"manager");
        System.out.println(employee2);

        ///CarAndMotorBike
        Vehicle car=new Vehicle("Thailand","AK-24",2024,"red","4.5 vot");
        //Truck
        Vehicle truck=new Vehicle("Japan","3AC-4","10.6","blue");
        //General
        Vehicle general=new Vehicle("USA","34",3034);
        System.out.println(car);
        System.out.println(truck);
        System.out.println(general);


    }

}
