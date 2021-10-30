package Bai1;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String hobby;

    //Câu1
    public Person() {
        this(null, 0, null, null);
    }/*Hoặc
    public Person(){
        this.name=null;
        this.age=0;
        this.gender=null;
        this.hobby=null;
    }
    */

    public Person(String name ,int age ,String gender , String hobby){
        this.name=name;
//        setName(name);
        this.age=age;
//        setAge(age);
        this.gender=gender;
//        setGender(gender);
        this.hobby=hobby;
        // setHobby(hobby);
    }

    public String toString() {
        return "Person1 = {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
