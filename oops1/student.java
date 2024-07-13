package oops1;

public class student {
    public static  class stu{
        // This is the Data Type Creation
        String name;
         int rollNo;
        int age;

    }

    public static void main(String[] args) {
        stu s1 = new stu(); // Create object
        s1.name="Rajdwip"; // Initilization the value
        s1.age =13;
        s1.rollNo=89;

        stu s2= new stu(); // Create Second Object
//        s2.name="Soumen";
//        s2.age =17;
//        s2.rollNo=99;

        System.out.println(s1.name+" "+s1.age+" "+s1.rollNo);
        System.out.println(s2.name);
    }
    }

