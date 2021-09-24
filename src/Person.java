import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;



    public String getName(){
        return name;
    }



    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }



    public void setAge(int age){
        this.age=age;
    }
    public void sayHello(){
        System.out.println("Hello from " + name);
    }

    /// here we create the constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    };
//////////

    public static void main(String[] args) {
        Person person = new Person("Dustin", 24);
      person.sayHello();
//        Person person1 = new Person();
//        person1.name = "Dustin";


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        person1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.name);
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }
}
