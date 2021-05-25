import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("The value of pi is approximately: %.2f%n", pi);
//
        Scanner scanner = new Scanner(System.in);
//        System.out.println("\n What is your favorite number?");
//        int num = scanner.nextInt();
//        System.out.printf("Your number is: %d", num);
        ////if you type in something else other then a int you get a mismatch exception error

        Scanner userString = new Scanner(System.in);
        System.out.println("Enter in 3 words");
        String first = userString.next();
        String second = userString.next();
        String third = userString.next();;

        System.out.println("Your first word is: " + first);
        System.out.println("Your second word is: " + second);
        System.out.println("Your third word is: " + third);


        //////////////////another way to do it///////////////////////
//        System.out.println("Please enter 3 words.");
//        String first = newScanner.next();
//        String second = newScanner.next();
//        String third = newScanner.next();
//        System.out.printf("Your 3 words were: %s, %s, and %s%n", first, second, third);



        Scanner userSentence = new Scanner(System.in);

//        System.out.println("Enter a sentence");
//
//        String sentence = userSentence.nextLine();
//        System.out.println("You typed: " + sentence);

        System.out.println("Give me a sentence!");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.printf("You entered \"%s\"%n", sentence);


        System.out.println("Give me a length in meters: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.printf("Length entered: %d meters. %nGive me a width in meters:%n", length);
        int width = Integer.parseInt(scanner.nextLine());

        System.out.printf("Length entered: %d meters. %nWidth entered: %d meters. %nArea of room: %d meters squared.%nPerimeter of room: %d meters. %n", length, width, length * width, 2 * width + 2 * length);


















    }
}
