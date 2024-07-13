package inheritence;

public class dog extends  dogfather{
    final String name="raj";
    void bark(){
        super.bark(); // Invoke the parent class method
        System.out.println("Barking");
    }
//    // Do not create bcz the eat() is Final in the parent class
//    void eat(){
//
//    }

    public static void main(String[] args) {
        dog obj = new dog();

        obj.bark();
        obj.eat();
//        obj.name = "biswa"; // do not change the value of the variable bcz string name is final
    }
}
