package Bai3;

public class RunMain {
    public static void main(String[] args) {
        Guns a=new Guns("Anh Điệp");
        Guns b=new Guns("Anh Doan");
        while(a.getAmmoNumber()>0 && b.getAmmoNumber()>0){
            a.Load(Guns.Rd());
            b.Load(Guns.Rd());
            a.Shoot(Guns.Rd(),"Anh Điệp");
            b.Shoot(Guns.Rd(),"Anh Doan");
        }
        if(a.getAmmoNumber()==0&&b.getAmmoNumber()>0){
            System.out.println("Anh Doan Thắng!!!");
        }
        if(a.getAmmoNumber()>0&&b.getAmmoNumber()==0){
            System.out.println("Anh Điệp Thắng!!!");
        }
        if(a.getAmmoNumber()==0&&b.getAmmoNumber()==0){
            System.out.println("Hòa!!!");
        }


    }
}
