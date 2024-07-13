package oops2;

public class constractor {
    public static void main(String[] args) {
        student2 s1 = new student2("rajdwip",12);
        s1.display();
    }
}

class student2{
    String name;
    int roll;

    student2(String n, int r){
        name = n;
        roll = r;
    }

    void display(){
        System.out.println(name+" "+roll);
    }
}
