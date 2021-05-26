public class ControlFlow {
    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5){
//            System.out.println("If you're reading this, it means x is 5");
//        }
//        System.out.println("this will run regardless of what x is");

//        int y =2;
//        if (y==2){
//            System.out.println("I've carried out a conditional test and I confirm that the statement 'y==2' is true");
//        }else {
//            System.out.println("I've carried out a conditional test and I confirm that the statement 'y==2' is false");
//        }

//        short y = -5;
//        y = 32000;
//        if(y < 0){
//            System.out.println("The variable y contains a negative number value");
//        } else if(y >= 0 && y < 30000){
//            System.out.println("The variable y contains a positive number value");
//        }else {
//            System.out.println("The variable y contains a numeric value that is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }

//
//        String customerChoice;
//        customerChoice = "chocolate";
//
//        switch (customerChoice) {
//            case "vanilla":;
//            System.out.println("One vanilla coming right up");
//            break;
//
//            case "chocolate":
//                System.out.println("Chocolate coming right up");
//                break;
//
//            case "strawberry":
//                System.out.println("Strawberry coming right up");
//                break;
//
//            default:
//                System.out.println("We dont have that! Go away!");
//                break;

//        boolean existence = true;
//        if(existence){
//            System.out.println("The programmer is a real being");
//        }




        /////////////////Logical Operators//////////////////////////////////

        ///in Java you can do && || &

//        && is a short circut so if the first condition is not true it will short circut and not continue the other conditionals.
        ////////& is not a shirt circut it will continue witht he rest of the conditions
//        /
//
//            int c = 0, d = 100, e = 50;
//
//            if (c == 0 && e++ < 100){
//                //do anything
//            }
//        System.out.println("e = " + e);





        //////////////////loops//////

//        int i =1;
//
//        while(i < 10){
//            System.out.println("Now im in the loop. i has not incremented yet and its value is " + i);
//            i++;
//            System.out.println("Im still in the loop. I have now incremented and my value is " + i);
//        }

////do while



        //////////

//        for (int i = 0; i < 10; i++) {
//            System.out.println("now m in the loop. i has not incremented yet and its value is " + i);
//        }



//        for (int i = 99; i > 0; i--) {
//            System.out.println(i + " bottles of big red on the wall, " + i + " bottles of big red, take one down pass it around ");

        for (int i = 99; i > 0; i--){
            if (i ==1){
                System.out.println(i + " can of Big Red on the Wall, ");
                System.out.println(i + " can of Big Red, ");
            } else {
                System.out.println(i + " cans of Big Red on the Wall, ");
                System.out.println(i + " cans of Big Red");
                System.out.println("Take one down, pass it around, ");
            }
        }


    }
}
