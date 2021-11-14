package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu,tenPhieu;
    DataTime a=new DataTime();
    int n;
    ArrayList<SanPham> x;
    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập mã phiếu : ");
        maPhieu=scanner.nextLine();
        System.out.println("Nhập tên phiếu : ");
        tenPhieu=scanner.nextLine();
        a.nhap();
        System.out.println("Nhập n : ");
        n=scanner.nextInt();
        x=new ArrayList<>();
        for(int i=0;i<n;i++){
            SanPham sp=new SanPham();
            sp.nhap();
            x.add(sp);
        }
    }


    public void xuat(){
        System.out.println("Mã phiếu : "+maPhieu);
        System.out.println("Tên phiếu : "+tenPhieu);
        System.out.format("%20s%20s%10s%10s%15s","Mã sản phẩm","Tên sản phẩm","Số lượng","Đơn giá","Thành tiền");
        System.out.println();
        for(SanPham sp: x){
            sp.xuat();
        }
    }
}
