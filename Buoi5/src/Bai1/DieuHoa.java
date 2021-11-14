package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    private double congSuat,giaBan;

    public DieuHoa() {
    }

    public DieuHoa(String maSP, String tenSP, String tenHang, String ngayNhap, double congSuat, double giaBan) {
        super(maSP, tenSP, tenHang, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập công suất : ");
        congSuat=scanner.nextDouble();
        System.out.println("Nhập giá bán(Triệu đồng) : ");
        giaBan=scanner.nextDouble();
    }
    public void xuat(){
        super.xuat();
        System.out.println("Công suất : "+congSuat);
        System.out.println("Giá bán : "+giaBan+"Triệu đồng");
    }

}
