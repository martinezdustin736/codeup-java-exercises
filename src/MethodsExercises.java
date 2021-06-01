import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(factorial(getInteger(0, 20)));
        diceRoll();
    }

    public static long add(long num1, long num2) {
        return num1 + num2;
    }

    public static long subtract(long num1, long num2) {
        return num1 - num2;
    }

    public static long multiply(long num1, long num2) {
        long sum = 0L;
        for (long i = 1; i<=num2 ; i++) {
            sum += num1;
        }
        return sum;
    }



    public static long divide(long num1, long num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            input = sc.nextInt();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }


    public static String factorial(long num) {
        long factorial = 1L;
        String result = " = ";
        for (long i = 1L; i <=num; i++) {
            factorial *= i;
            if (i == num) {
                result += i;
            } else {
                result += i + " x ";
            }
        }
        return factorial + result;
    }

    public static void diceRoll(int sides, int numberOfDice) {
        for (int i = 1; i <= numberOfDice; i++) {
            int result = (int) Math.floor(Math.random() * ((sides - 1) + 1) + 1);
            System.out.println(result);
        }
    }

    public static void diceRoll() {
        boolean keepGoing = true;
        while (keepGoing) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many sides is the die?");
            int sides = sc.nextInt();
            System.out.println("How many die are you wanting to roll?");
            int numDice = sc.nextInt();
            diceRoll(sides, numDice);
            sc.nextLine();
            String answer = " ";
            while (!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No")) {
                System.out.println("Keep playing? [Yes/No]");
                answer = sc.nextLine();
            }
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("Thanks for playing!");
                keepGoing = false;
            }
        }
    }

//    public static void guessNumber() {
//        Scanner scanner = new Scanner(System.in);
//        int counter = 0;
//        boolean correct = false;
//        Random rand = new Random();
//        int answer = rand.nextInt(100) + 1;
//        System.out.println("answer:" + answer);
//        System.out.println("Guess a number between 1 and 100");
//        do {
//            System.out.printf("You have %d attempts remaining.%n", 10 - counter);
//            if (counter == 10) {
//                System.out.println("You failed to guess the correct answer. Try again.");
//                break;
//            }
//            else if (scanner.hasNextInt()) {
//                int guess = scanner.nextInt();
//                if (guess > 100 || guess < 1) {
//                    System.out.println("You did not enter a valid guess.");
//                    System.out.printf("%nWould you like to try again? Y/N%n");
//                    String resp = scanner.next();
//                    if (resp.toLowerCase().startsWith("y")) {
//                        guessNumber();
//                    } else {
//                        System.out.println("Come back when you're ready to play. Goodbye");
//                    }
//                } else if (guess > answer) {
//                    System.out.println("LOWER");
//                    counter++;
//                } else if (guess < answer) {
//                    System.out.println("HIGHER");
//                    counter++;
//                } else {
//                    System.out.println("GOOD GUESS!!");
//                    correct = true;
//                }
//            } else if (!scanner.hasNextInt()){
//                System.out.println("You did not enter a number. Restart and play the game the right way.");
//                break;
//            }
//
//        } while (correct == false);
//    }

}
