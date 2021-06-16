package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String enter_a_number) {
        System.out.println("enter a sentence");
        String userSentence = scanner.nextLine();
        return userSentence;
    }

    public boolean yesNo() {
        System.out.println("Enter yes or no");
        String yesNo = scanner.nextLine();
        boolean result = false;
        if (yesNo.equalsIgnoreCase("yes")) {
            result = true;
        } else if (yesNo.equalsIgnoreCase("no")) {
            result = false;
        }
        System.out.println("Your boolean is " + result);
        return result;
    }

    public int getInt(String s) {
        return this.scanner.nextInt();
    }


//    public int getInt(int min, int max) {
//        System.out.printf("please enter a number between %d and %d%n", min, max);
//        public int getInt(String) {
//            try {
//                return Integer.parseInt(getString("Enter a number"));
//            } catch (NumberFormatException e) {
//                System.err.println("Invalid input, try again.");
//                return getInt();
//            }
//        }
//    }


public double getDouble(double min, double max){
    System.out.printf("Give me a decimal number between %f and %f", + min, max);
    double userNumber = this.scanner.nextDouble();

    if (userNumber >= min && userNumber <= max){
        return userNumber;
    } else {
        System.out.println("That number is invalid");
        return getDouble(min, max);
    }
}

    public double getDouble(){
        System.out.println("Please enter a decimal number!");
        double userDouble = scanner.nextDouble();
        return userDouble;
    };



}
