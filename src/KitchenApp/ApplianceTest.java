package KitchenApp;

//Abstract class
//can serve as a superclass, but we cant directly instantiate an abstract class

public class ApplianceTest {
    public static void main(String[] args) {
        //Will get an error by trying to directly instantiate an abstract class
//        Appliance app1 = new Appliance();



        Appliance app1 = new Refrigerator("two door", "LG", true);
        Appliance app2 = new Microwave("Digital", "Samsung");


        System.out.println(app1.brandName);
        System.out.println(app1.type);

        System.out.println("The brand is "+ app2.brandName);
        System.out.println("The type is " + app2.type);

//        System.out.println(app1.isHasIce());
//        sayHello();

    }
}
