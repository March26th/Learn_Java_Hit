package Bai2;

import java.util.Scanner;

public class DataTime {
    private int day,month,year;

    public DataTime() {
    }

    public DataTime(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void nhap(){
        System.out.println("Nhập ngày : ");
        Scanner scanner=new Scanner(System.in);
        day=scanner.nextInt();
        System.out.println("Nhập tháng : ");
        month=scanner.nextInt();
        System.out.println("Nhập năm : ");
        year=scanner.nextInt();
    }
    public void xuat(){
        System.out.println("Ngày : "+day+" / "+month+" / "+year);
    }

}
