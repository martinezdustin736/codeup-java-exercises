package util;

import java.util.Scanner;

public class Input {
private Scanner scanner;

public Input(){
    this.scanner = new Scanner(System.in);
}

public String getString(){
    System.out.println("enter a sentence");
    String userSentence =scanner.nextLine();
    return userSentence;
}

public boolean yesNo(){
    System.out.println("Enter yes or no");
    String yesNo = scanner.nextLine();
    boolean result = false;
    if (yesNo.equalsIgnoreCase("yes")){
        result = true;
    }
    else if (yesNo.equalsIgnoreCase("no")){
        result = false;
    }
    System.out.println("Your boolean is " + result);
    return result;
}

public int getInt(){
    return this.scanner.nextInt();
}


public int getInt(int min, int max){
    System.out.printf("please enter a number between %d and %d%n", min, max);
    int userNum = scanner.nextInt();
    if(userNum < min || userNum > max ){
        System.out.println("Please only enter a number between min and max");
        getInt(min, max);
    }
    else {
        System.out.printf("Thank you! Your number %d is between the range " + userNum);
    }
    return userNum;
}

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
