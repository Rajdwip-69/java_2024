package LearnPolymorphism;

public class overiding extends o1 {

    void bark(){
        super.bark();
        System.out.println("Meoww!!!");


    }
    public static void main(String[] args) {
        overiding o1 = new overiding();
        o1.bark();

    }
    }

