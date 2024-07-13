package arrays;

public class sumofarray {
    public static void main(String[] args) {
        int nums [] = {23,12,6,7,15,3,2,56};
        int sum = 0;
        for(int num : nums){
           sum= sum+num;
        }
        System.out.println(sum);
    }
}
