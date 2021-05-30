public class MethodsLecture {

    public static void sayHello(String name) {
        System.out.printf("Hi there, My name is %s! Have a great day!%n ", name);
    }

    public static void sayHello(String salutation, String name){
        System.out.printf("%s there! My name is %s! have an awesome day!%n", salutation, name);
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }







    public static void main(String[] args) {
        sayHello("Dustin");
        sayHello("Hi", "Dustin");
        System.out.println( multiply(5, 2));
        int product = multiply(5, 5);
        System.out.printf("Did you know that %d X %d ='s %d", product, product, product * product);

    }
}
