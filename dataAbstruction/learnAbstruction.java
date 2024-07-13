package dataAbstruction;

public class learnAbstruction {
    public static void main(String[] args) {
//        vehicle v1 = new vehicle();
        car c1 = new car();
        c1.acclerate();
        c1.wheel();

    }
}

abstract  class vehicle{
   abstract  void acclerate();

    abstract void wheel();

}
class car extends vehicle{

    @Override
    void acclerate() {
        System.out.println("Car is Acclerating");
    }

    @Override
    void wheel() {
        System.out.println("Breaking!!!");
    }
}