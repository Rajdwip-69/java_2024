package inheritence;

public class car extends vehicle{
    public static void main(String[] args) {
        car obj = new car();
        obj.color="Black";
        obj.wheelCount = 4;
        obj.model ="suv";
        obj.start();
        System.out.println(obj.model);

    }
}
