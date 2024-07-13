package oops2;

public class constractorOverload {
    public static void main(String[] args) {
        student3 s2 = new student3(19,"Rajdwip");
        student3 s3 = new student3(16,"Sunny",67);
        s2.display();
        s3.display();
    }
}
class student3{
    int age;
    int roll;
    String name;
    student3(int age,String name){
        this.age=age;
        this.name = name;
    }
    student3(int a, String n ,int r){
        age = a;
        roll = r;
        name = n;
    }

    void display(){
        System.out.println(age+" "+name+" "+roll);
    }


}
