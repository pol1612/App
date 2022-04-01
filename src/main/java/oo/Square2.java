package oo;

public class Square2 implements Square, Printable{
    static final int version = 2;
    private int side;
    private int area;
    private int perimeter;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
            area = side*side;
            perimeter = side*4;
        }

    }

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public int getTriplePerimeter() {
        return perimeter*3;
    }

    public String print() {
        return  "Square2: " + side + ", " + getArea()  + ", " + getPerimeter();
    }
}
