public class Penguin extends Bird {


    //override make noise
    public void makeNoise(){
        System.out.println(this.getName() + " goes honk honk");
    }

    //override move
    public void move(){
        System.out.println(this.getName() + " goes waddle waddle");
    }
}
