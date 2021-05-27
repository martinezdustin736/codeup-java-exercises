import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        char character = 'd';

        System.out.println(character == 'd');

        Scanner scanner = new Scanner(System.in);
        String bob = "Uncle Bob";
        System.out.println("Hey David, who is your favorite surviving uncle?");
        String maybeBob = scanner.nextLine();
        System.out.println("User answered with correct answer AND capitalization: " + bob.equals(maybeBob));
        System.out.println("User answered with correct answer AND capitalization: " + bob.equalsIgnoreCase(maybeBob));



        //compare the start and end of strings

        String david = "David";
        String dad = "Dad";
        String firstLetterDavid = "" + david.charAt(0);
        System.out.println("David and Dad  start with the same letter?: " + dad.startsWith(firstLetterDavid));

        /////manipulation

        int locationOfAInDad = dad.indexOf("a");
        System.out.println("The location of 'a' in the string of \"Dad\" is: " + locationOfAInDad);

    }
}
