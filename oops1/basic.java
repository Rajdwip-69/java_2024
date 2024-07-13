package oops1;

public class basic {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.name = "Tommy";
        d1.bark();

        dog d2 = new dog();
        d2.name = "Leo";
        d2.walk();





    }
}

class dog{
    String name;
    String color;
    int age;

    void walk(){
        System.out.println(name+" is Walking");
    }

    void bark(){
        System.out.println(name+" is Barking");
    }
}
