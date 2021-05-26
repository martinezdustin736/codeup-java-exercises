import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        int i =0;
//        do {
//            System.out.println(i * 2);
//            i++;
//        }
//        while(i <= 50);


//
//        int i =105;
//        do {
//            System.out.println(i - 5);
//            i--;
//        }
//        while(i >= -5);



//        long k = 2;
//        do {
//            System.out.println(k);
//            k *= k;
//        } while (k <= 1000000);
//
//        long i =2;
//
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);
        ////////Why doesn't this work using int???


//        for(int i = 105; i >=-5; i--){
//            System.out.println(i -5);
//
//        }

//        for(long i =2; i <= 1000000; i*=i){
//            System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);
        final int pin = 1234;
        for (int i =0; i <=2; i++){
            System.out.println("Enter the correct pin to log in: ");
            int attempt = scanner.nextInt();
            if(attempt == pin){
                System.out.println("Welcome back!");
                break;
            } else if(i == 2){
                System.out.println("You are now locked out");
            }else {
                System.out.println("Try again!");
            }
        }






    }
    }


