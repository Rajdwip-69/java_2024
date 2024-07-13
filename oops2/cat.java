package oops2;

public class cat extends dog {
    void bark(){
//        super.bark();
        System.out.println("Meowww!!!");
    }

    public static void main(String[] args) {
        cat c1 = new cat();
        c1.bark();
        dog d1  = new dog();
        d1.bark();
    }
}
