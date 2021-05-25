import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately: %f", pi);
//
        Scanner scanner = new Scanner(System.in);
//        System.out.println("\n What is your favorite number?");
//        int num = scanner.nextInt();
//        System.out.printf("Your number is: %d", num);
        ////if you type in something else other then a int you get a mismatch error

        Scanner userString = new Scanner(System.in);
        System.out.println("Enter in 3 words");
        String first = userString.next();
        String second = userString.next();
        String third = userString.next();;

        System.out.println("Your first word is: " + first);
        System.out.println("Your second word is: " + second);
        System.out.println("Your third word is: " + third);



        Scanner userSentence = new Scanner(System.in);

        System.out.println("Enter a sentence");

        String sentence = userSentence.nextLine();
        System.out.println("You typed: " + sentence);


        Scanner userValues = new Scanner(System.in);
        System.out.println("Enter in length");
        int length = Integer.parseInt();













    }
}
