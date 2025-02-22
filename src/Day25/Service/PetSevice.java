package Day25.Service;
import Day25.Model.Pet;
import Day25.Util.DataUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class PetSevice {

    public static void petMain(){
        boolean flagg=true;
        while(flagg){
            System.out.println("!!Welcome Pet Management!!");
            System.out.println("1. Pet Register");
            System.out.println("2. Pets Display All");
            System.out.println("3. Exit");
            String flag=DataUtil.scanner.nextLine();
            switch (flag){
                case "1": petRegister(); break;
                case "2": displayAll(); break;
                case "3": flagg=false;break;

            }
        }

    }

    public static void petRegister(){
        while(true){
            try {
                System.out.println("!!!Add Pet Information!!!!");
                Pet pet=getPetInfo();
                Pet.add(pet);
                System.out.println("Do you want to add more Yes/No");
                String flag=DataUtil.scanner.nextLine();
                if(flag.toLowerCase().equals("no")){
                    break;
                }
            } catch (ParseException e) {
              System.out.println("Error Message: "+e.getMessage());
              System.out.println("Please Try Input Again");
            }
        }
    }
    public static void displayAll(){
        for(Pet pet:Pet.getPets()){
            System.out.println(pet);
        }
    }

    private static Pet getPetInfo() throws ParseException {
        System.out.println("Enter Pet Name :");
        String name=DataUtil.scanner.nextLine();
        System.out.println("Enter Pet Licen :");
        String licen=DataUtil.scanner.nextLine();
        System.out.println("Enter Date of Birth (dd/mm/yyyy) :");
        Date dob=DataUtil.stringToDateConvector(DataUtil.scanner.nextLine());
        System.out.println("Enter Species of pet :");
        String species=DataUtil.scanner.nextLine();
        System.out.println("Enter Pet Owner :");
        String owner=DataUtil.scanner.nextLine();
        Pet pet=new Pet(name,licen,DataUtil.dateToAgeConvector(dob),species,dob,owner);
        return pet;
    }
    private static void getPetById(){

    }
    private static void deletePetById(){

    }
    private static void updatePetById(){

    }
}
