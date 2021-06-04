import java.util.Arrays;

public class ArraysLec {
    public static void main(String[] args) {
        int[] numbers ={14, 64, 34, 44};
        for(int i = 0; i < numbers.length;i++) {
            numbers[1] = 33;
//            numbers[4]= 73; ///no index of 4- so we get an ArrayIndexOutOfBoundsException

            System.out.println(numbers[i]);
            //////[I@5acf9800 this is what it will return so we need to make it human readable- Do a for loop. You can also use an enhanced loop            for(int number : numbers){
            // System.out.Println(number);
            // }
        }

        String[] topFiveBoyNames = new String[5];

        topFiveBoyNames[0] ="Greg";
        topFiveBoyNames[1] ="Jim";
        topFiveBoyNames[2] ="Geoff";
        topFiveBoyNames[3] ="Dustin";
        topFiveBoyNames[4] ="Naysa";

        for ( String boyNames : topFiveBoyNames){
            System.out.println(boyNames);
        }

        boolean [] lookingAtDefaultValue =new boolean[3];
        for (boolean boo : lookingAtDefaultValue){
            System.out.println(boo);
            ///////default false from table of values before initialized
        }

        Arrays.fill(lookingAtDefaultValue, true);
        for (boolean boo : lookingAtDefaultValue) {
            System.out.println(boo);
        }

        int [] alsoNums =  {14, 33, 34, 44};

        for (int number : numbers){
            System.out.println(number);
        }

        for (int number : alsoNums){
            System.out.println(number);

        }
        System.out.println(Arrays.equals(numbers, alsoNums));

        int [] yetMoreNums = Arrays.copyOf(numbers, 5);
        for (int number : yetMoreNums) {
            System.out.println(number);
        }

        int[] unsortedNightmare = {99,-19,88,0,3,44,13};
        Arrays.sort(unsortedNightmare);
        System.out.println(Arrays.toString(unsortedNightmare));

    }
}
