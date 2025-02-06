package Day20.Model;


import java.util.Date;

public class Book {
    private String name;
    private String author;
    private int quantity;
    private String email;
    private Date publishDate;
    private int rent;

    public Book() {
        this.name = "";
        this.author = "";
        this.quantity = 0;
        this.email = "";
        this.publishDate = new Date();
        this.rent = 0;
    }

    public Book(String name, String author, int quantity, String email, Date publishDate, int rent){
        this.name=name;
        this.author=author;
        this.quantity=quantity;
        this.email=email;
        this.publishDate=publishDate;
        this.rent=rent;
    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getEmail() {
        return email;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public int getRent() {
        return rent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }
    public String toString(){
        return name +" |"+author+" |"+quantity+" |"+email+" |"+publishDate+" |"+rent+" |";
    }
//    public String toString() {
//        return  name + "  |" +
//                licen + "  |" +
//                color + "  |" +
//                model + "  |" +
//                productionDate +"  |"+
//                numberOfVehicles+"  |" +
//                ownerEmail + "  |" ;
//    }



}
