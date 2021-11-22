package Bai1;
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        int dem=0;
        for(int i=0; i<s.length(); i++) {
            char temp = s.charAt(i);
            if (Character.isDigit(temp)) {
                int a = Integer.parseInt(String.valueOf(temp));
                sum+=a;
                dem++;
            }
        }
        System.out.println("sum : "+sum);
        int tich=1;
        System.out.println("Có "+ dem +" số");
        for(int i = 1; i <= sum; i++){
            if(sum % i == 0){
                tich*=i;
            }
        }
        System.out.println("Tích  : " + tich);
    }
}
