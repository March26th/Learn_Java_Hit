package Bai2;

import java.util.Scanner;

public class Document {
     protected int numberOfPage;
     protected String author;

    public Document() {
    }

    public Document(int numberOfPage, String author) {
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number Of Page : ");
        numberOfPage=sc.nextInt();
        System.out.println("Input author : ");
        sc.nextLine();
        author=sc.nextLine();
    }
    public void Xuat(){
        System.out.format("%-20d %-20s"+numberOfPage,author);
    }
}
