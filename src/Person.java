import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello from " + this.name);
    }

    public Person(){};

    public Person(String name){
        this.name = name;
    };


    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.name = "Dustin";
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
        person1.sayHello();


    }
}
