package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain{
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n : ");
        n=scanner.nextInt();
        ArrayList<DieuHoa> dieuHoaArrayList = new ArrayList<>();
        for(int i=0;i<n;i++){
            DieuHoa a=new DieuHoa();
            a.nhap();
            dieuHoaArrayList.add(a);
        }
        System.out.println("============Thông tin các điều hòa nhập vào=============== ");
        for(DieuHoa o:dieuHoaArrayList){
            o.xuat();
            System.out.println();
        }
        System.out.println("================Thông tin các điều hòa có tên hãng sản xuất là Eclectrolux========");
        int dem=0;
        for(DieuHoa o : dieuHoaArrayList){
            if(o.getTenHang().equals("Eclectrolux")){
                o.xuat();
                dem++;
                System.out.println();
            }
        }
        if(dem==0){
            System.out.println("Không có tên hãng sản xuất nào là Eclectrolux!!!");
        }

    }
}

