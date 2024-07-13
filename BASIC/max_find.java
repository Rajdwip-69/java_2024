import java.util.Scanner;


public class max_find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nmubers:");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if(a>b && a>c){
//            System.out.println("A is Grater");
//        } else if (b>a && b>c) {
//            System.out.println("B is Grater");
//        }
//        else{
//            System.out.println("C is Grater ");
//        }


        // Ternary Operator

        int a = 20;
        int b = 10;
        int max = 0;

        max = a>b ? a : b;
        System.out.println(max);



    }
}
