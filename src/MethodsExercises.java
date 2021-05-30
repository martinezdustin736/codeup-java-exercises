import java.util.Scanner;

public class MethodsExercises {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }




    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }



    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > max || input < min){
            System.out.printf("Invalid ! Enter a number between %s to %s:", min, max);
            return getInteger(min, max);
        }
        System.out.printf("You entered %s!", input);
        return input;
    }









    public static void main(String[] args) {
        System.out.println(add(10, 5));
        System.out.println(subtract(100, 10));
        System.out.println(multiply(10, 5));
        System.out.println(divide(10, 2));
        System.out.println(modulus(5,2));


        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);

    }
}
