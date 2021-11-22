package Bai2;
import java.util.Scanner;
public class Book extends Document {
    private int id;
    private String name,puclisher ;
    private float price;

    public Book() {
    }

    public Book(int numberOfPage, String author, int id, String name, String puclisher, float price) {
        super(numberOfPage, author);
        this.id = id;
        this.name = name;
        this.puclisher = puclisher;
        this.price = price;
    }
    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID: ");
        id= sc.nextInt();
        System.out.println("Input name : ");
        name=sc.nextLine();
        sc.nextLine();
        System.out.println("Input publicsher : ");
        puclisher=sc.nextLine();
        System.out.println("Input price : ");
        price= sc.nextFloat();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.format("%-15d %-15s %-15s %-15f\n", id ,name,puclisher,price);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPuclisher() {
        return puclisher;
    }

    public void setPuclisher(String puclisher) {
        this.puclisher = puclisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
