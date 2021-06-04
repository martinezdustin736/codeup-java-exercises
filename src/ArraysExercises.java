public class ArraysExercises {




    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

//        String [] people = {"John", "Jane","Dustin"};

        Person[] people = new Person[3];

        people [0] = new Person("John");
        people [1] = new Person("Jane");
        people [2] = new Person("Dustin");


     for (Person person : people) {
         System.out.println(person.getName());

     }

    }
}


