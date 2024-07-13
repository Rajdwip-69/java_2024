package oops1;

public class complexNumber {
    public static void main(String[] args) {
        Complex num1 = new Complex(2,8);
        Complex num2 = new Complex(3,7);
        num1.print();
        num2.print();
    }
}

class Complex{
    int a ,b;
    // Create the Constructor
    public Complex(int real, int imaginary ){
        a = real;
        b = imaginary;
        System.out.println("New Constarctor");

    }

    void print(){
        System.out.println(a+" + " +b+"i");
    }
}
