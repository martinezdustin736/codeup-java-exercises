public class Person2 {

    //field or property
    private String name;


    //String sets up the type were requesting
    public String getName(){

        return name;
    }

    //We arent getting anything back void means nothing is being returned
    //this refers to person2
    //name is the property

    public void setName(String inputName){

        this.name = inputName;
    }

    public void sayHello(){

        System.out.println("Hi" + name);
    }

    ///overloading using the same function with different parameters
    public void sayHello(String inputName){

        System.out.println(name + inputName);
    }


    //Constructor this helps create the object it tells the compiler how to create and what input
    public Person2 (String inputName){

        this.name = name;
    }





    public static void main(String[] args) {
        Person person = new Person("Dustin", 30);
        System.out.println(person.getName());


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);


/// here it set Person person2 = person1; so it takes on the same String name both times

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());






    }

}
