package Bai1;

public class Main {
    public static void main(String[] args) {

        Person s1 =new Person("Nguyễn Văn A",19,"Nam","Sport!");
        System.out.println(s1);

        Person s2=new Person();
        s2.setName("Nguyên");
        s2.setAge(19);
        s2.setGender("Nam");
        s2.setHobby("Game , Music ");
        System.out.println("Person2");
        System.out.println("Name : " + s2.getName());
        System.out.println("Age : " + s2.getAge());
        System.out.println("Gender : " + s2.getGender());
        System.out.println("Hobby : " + s2.getHobby());
    }
}
