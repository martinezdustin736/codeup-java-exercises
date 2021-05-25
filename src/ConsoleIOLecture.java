import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        String name = "Dustin";
//        System.out.printf("Hello, %s", name);

//        System.out.println("new line");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey friend, how's it going?");
        String userInput = scanner.nextLine();

        System.out.printf("You're feeling:%s%n", userInput);

        System.out.println("Give me a number.");
        int num = scanner.nextInt();

        System.out.printf("Your number is:%d%n", num);



    }
}
