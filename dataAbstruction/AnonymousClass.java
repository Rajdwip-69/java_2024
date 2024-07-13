package dataAbstruction;

public class AnonymousClass {
    static outerClass obj = new outerClass(){
        void bark(){
            System.out.println("Barking");
        }
    };

    public static void main(String[] args) {
        obj.sing();
    }
}
class outerClass{
    void sing(){
        System.out.println("Singing");
    }
}