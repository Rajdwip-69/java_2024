package learnEncapsulation;

public class test {
    public static void main(String[] args) {
        person p1 = new person();
//        p1.age = 12;
        p1.setAge(12);
        System.out.println(p1.getage());
    }
}
