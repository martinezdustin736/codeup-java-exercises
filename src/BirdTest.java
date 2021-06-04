public class BirdTest {
    public static void main(String[] args) {
//        Bird cardinal = new Bird();
//        cardinal.setName("cardinal");
//        cardinal.setCanFly(true);
//        cardinal.makeNoise();
//        cardinal.move();

        Duck mallard = new Duck();
        mallard.setName("Mallard");
        mallard.makeNoise();

        Finch lesserGoldFinch = new Finch();
        lesserGoldFinch.setName("Lesser Goldfinch");
        lesserGoldFinch.makeNoise();
//
//        Penguin penguin = new Penguin();
//        penguin.setName("Penguin");
//        penguin.move();
//        penguin.makeNoise();
    }

    //Polymorphism allows us to have different reference
    Bird myPenguin = new Penguin();


    Finch houseFinch = new Finch();
}

