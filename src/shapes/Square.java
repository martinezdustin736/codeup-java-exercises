package shapes;

public class Square extends Rectangle {
public Square (int side){
    super(side,side);
}
private int side;

public int getSide(){
    return side;
}

public void setSide(int side){
    this.side = side;
}

public int getArea(){
    this.setSide(this.width);
    return this.getSide() * this.getSide();


}

    public int getPerimeter() {
        this.setSide(this.width);
        return 4 * getSide();
    }
}
