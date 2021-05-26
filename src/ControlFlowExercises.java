import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i++ + " ");
//        }

//        int i =0;
//        do {
//            System.out.println(i * 2);
//            i++;
//        }
//        while(i <= 50);

        //////////////////////////////////javiers solution underneath

//        int i =0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }
//        while(i <= 100);



//        int i =105;
//        do {
//            System.out.println(i - 5);
//            i--;
//        }
//        while(i >= -5);
//////////////////////////////////javiers solution underneath
//        int i =100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }
//        while(i >= -10);



//        long k = 2;
//        do {
//            System.out.println(k);
//            k *= k;
//        } while (k < 1000000);




//        long i =2;
//
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

        ////////Why doesn't this work using int???

///////////////////////////////////////////for loops
//        for(int i = 105; i >=-5; i--){
//            System.out.println(i -5);
//
//        }
/////////////////////////////////////////////////javiers
//        for(int i = 100; i >= -10; i -=5){
//            System.out.println(i);
//        }

//        for(long i =2; i <= 1000000; i*=i){
//            System.out.println(i);
//        }
//////////////////////////////////////////////////////

//        for(long i =2; i < 1000000; i *= i){
//            System.out.println(i);
//        }

///////////////////////////////////////////////////////


        Scanner scanner = new Scanner(System.in);
//        final int pin = 1234;
//        for (int i =0; i <=2; i++){
//            System.out.println("Enter the correct pin to log in: ");
//            int attempt = scanner.nextInt();
//            if(attempt == pin){
//                System.out.println("Welcome back!");
//                break;
//            } else if(i == 2){
//                System.out.println("You are now locked out");
//            }else {
//                System.out.println("Try again!");
//            }
//        }

//
//        System.out.println("What number would you like to go up to? ");
//        boolean userWantsToContinue = false;
//
//        do {
//            int userInput = scanner.nextInt();
//            System.out.println("here is your table!");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | --------| -----");
//            for (int i = 1; i <= userInput; i++){
//                System.out.printf("%-7d | %-8d |  %-5d%n", i, i * i, i * i * i);
//        }
//            System.out.println("Enter another number? y/n");
//            String userAnswer = scanner.next();
//            if (userAnswer.equals("y")){
//                userWantsToContinue = true;
//            }
//        }  while(userWantsToContinue);


        System.out.println("Would you like to find out your grade?");
        String answer = scanner.next().toLowerCase();
        if (answer.equals("yes")) {
            System.out.println("Enter your grade 0-100");
            int grade = scanner.nextInt();
            if ((grade >= 88) && (grade <= 100)) {
                System.out.println("Your grade is an A!");
            } else if ((grade >= 80) && (grade <= 87)) {
                System.out.println("Your grade is a B!");
            } else if ((grade >= 67) && (grade <= 79)) {
                System.out.println("Your grade is a C!");
            } else if (grade <= 59) {
                System.out.println("Your grade is a F!");
            }
        }

    }
    }


