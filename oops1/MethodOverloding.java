package oops1;

public class MethodOverloding {
    public static void main(String[] args) {
      Greet  g1 = new Greet();
      g1.greeting();
      g1.greeting("Rajdwip");
    }
}
class Greet{
    void greeting(){
        System.out.println("Hello, Good Morning");
    }

    void greeting(String name){
        System.out.println("Hello ,"+name+" Good Morning");

    }
}