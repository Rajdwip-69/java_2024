import java.util.Scanner;

public class javaLoops {
    public static void main(String[] args) {
        //For Loop
//
//        for(int i = 0;i <= 10; i++){
//            System.out.println(i);
//
//        }

        // while Loop

//        int i = 0;
//        while(i<10){
//            System.out.println("I Love U");
//            ++i;
//        }


        // DO-WHILE LOOP
//        int i = 0;
//        do{
//            System.out.println("I love Java");
//            i++;
//        }while(i<10);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number:");
//        int n = sc.nextInt();
//        for(int i = 0; i<=10 ;i++){
//            System.out.println(n+"*"+i+ "="+n*i);
//        }

//        int sum = 0;
//        for(int i=1;i<=n;i++){
//            sum = sum+i;
//        }
//        System.out.println(sum);


//        int i = 0;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }


//        int i = 0;
//        for( int i = 1;i<=100;i++){
//            if(i==50){
//                continue; // BREAK
//            }
//            System.out.println(i);
//        }
//        for (int i = 0; i <=20 ; i+=2) {
//            System.out.println(i);
//            if(i>=10) continue;
//
//        }

        for (int i = 0; i <=20 ; i+=1) {
            if(i==2 || i==16) continue;
            if(i>=16 ) break;
            System.out.println("Gave Biriyani"+i);

        }



    }
}
