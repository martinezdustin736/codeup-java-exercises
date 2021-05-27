import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ask a question");
        String sentence = "";

        while (!sentence.equalsIgnoreCase("QUIT")) {
                    sentence = scanner.nextLine();
            if (sentence.endsWith("?")) {
                System.out.println("'Sure.'");
            } else if (sentence.endsWith("!")) {
                System.out.println("'Whoa, chill out!'");
            } else if (sentence.isEmpty()) {
                System.out.println("'Fine. Be that way!'");
            }else if (sentence.equalsIgnoreCase("quit")) {
                System.out.println("Finally.....");
            } else {
                System.out.println("'Whatever.' ");
            }
        }
    }
}
