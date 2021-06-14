import java.util.Scanner;

public class Input {

    //We set this one because it stays the same. It's always going to create a new scanner
    private Scanner scan = new Scanner(System.in);

    public String getString(){
      return scan.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Enter in yes for true");
        String input = scan.nextLine();
        if (input == "yes"){
            return true;
        }
        return false;
    }
    //set up parameters to return min and max number/ if-else to make sure numbers are within min and max
    public int getInt(int min, int max){
        int input = scan.nextInt();
        if (input > min && input < max){
            System.out.println("yay");
            return input;
        }
        return getInt(min, max);
    }

//    public double getDouble(double min, double max){
//
//    }



public int getInt(){
    System.out.println("Enter a number");
    return scan.nextInt();
}

public double getDouble(){
    System.out.println("Enter in a decimal number");
    return scan.nextDouble();
}




}



