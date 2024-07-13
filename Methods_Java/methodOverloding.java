package Methods_Java;

public class methodOverloding {
    static int myplus(int x, int y){
        return x+y;
    }
    static double myplus(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        int num1 = myplus(2,5);
        double num2 = myplus(2.2,7.8);
        System.out.println("The addition of Integer is:"+num1);
        System.out.println("The addition of Double is:"+num2);
    }

}
