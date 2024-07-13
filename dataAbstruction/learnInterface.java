package dataAbstruction;

public class learnInterface {
    public static void main(String[] args) {
     monkey m1 = new monkey();
    m1.eat();
    m1.bark();
    }
}

interface aminal{
    void eat();

}

interface dog{
    void bark();
}

class monkey implements dog,aminal {

    @Override
    public void eat() {
        System.out.println("Bnana");
    }

    @Override
    public void bark() {
        System.out.println("Barking");
    }
}
