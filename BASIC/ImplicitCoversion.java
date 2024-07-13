import org.w3c.dom.ls.LSOutput;

public class ImplicitCoversion {
    public static void main(String[] args) {
//        int count = 12;
//        long longCount = count;
//        System.out.println(longCount);

//        long count = 12;
//        int longCount = count;
//        System.out.println(longCount);

        // Explicit Conversion long to integer this is called type casting in JAVA

        long count = 12;
        int longCount =(int) count;
        System.out.println(longCount);

        int age  = 150;
        byte newage = (byte) age;
        System.out.println(newage);


    }
}
