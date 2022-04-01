package cat.uvic.teknos.m06.java2gradle;

public class Square1 implements Square, Printable {
    static final int version = 1;
    private int side;

    public Square1() {

    }

    public Square1(int side) {
        setSide(side);
    }

    public Square1(int side, int area) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }

    }

    public int getArea() {
        return side*side;
    }

    public int getPerimeter() {
        return side*4;
    }

    public int getDoublePerimeter() {
        return side*4*2;
    }

    public String print() {
        return  side + ", " + getArea()  + ", " + getPerimeter();
    }


}
