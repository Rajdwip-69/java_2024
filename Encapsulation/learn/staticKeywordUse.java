package Encapsulation.learn;

public class staticKeywordUse {


    public static void  printHello(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        accessStatic c1 = new accessStatic();
        c1.display();
//        accessStatic.count = 17;
        System.out.println(accessStatic.count);
        printHello();
    }
}
