public class Duck extends Bird {

    public void makeNoise() {
//        System.out.println(this.getName() + " goes quack quack");

        super.makeNoise();
        System.out.println("Quack Quack!");
    }
}
