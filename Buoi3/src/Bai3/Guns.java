package Bai3;

public class Guns {
    private String weaponName;
    private int ammoNumber;

    public Guns(String weaponName){
        this.weaponName=weaponName;
        this.ammoNumber=100;
    }
    public void Load(int x){
        this.ammoNumber+=x;
    }
    public void Shoot(int x,String weaponName){
        if(this.ammoNumber-x>=0){
            this.ammoNumber-=x;
        }
        if(this.ammoNumber==0){
            System.out.println(this.weaponName +" Hết Đạn !!!");
        }

    }
    public static int Rd(){
        int x= (int) ((Math.random())*((10-1)+1)+1);
        return x;
    }
    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
}
