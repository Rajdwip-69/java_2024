public class methodOverloading {
    static int plusMethod(int x, int y){
        return x+y;
    }
    static double plusMethod(double a, double b){
        return a+b;

    }

    public static void main(String[] args) {
        int mynum1 = plusMethod(5,7);
        double mynum2 = plusMethod(2.3,6.7);
        System.out.println("int:"+mynum1);
        System.out.println("Double:"+mynum2);

    }
}
