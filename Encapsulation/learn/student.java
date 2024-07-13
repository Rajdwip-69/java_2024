package Encapsulation.learn;

public class student {
    public void m1(){
        System.out.println("Hello Java");
    }
    protected void m2(){
        System.out.println("Hello C++");
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.m1();
        s1.m2();

    }
}
