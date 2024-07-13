package arrays;

public class findminimunin_array {
    public static void main(String[] args) {
        int numbers [] = {12,45,7,89,1,8};
        int min = Integer.MAX_VALUE;
        for(int number : numbers){
            if(number<min){
                min = number;
            }

        }
        System.out.println("Minimum Value is:"+min);
    }
}
