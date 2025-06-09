package ex_25_OOPs_Abstraction_Interface;

public class Lab183_Interface {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea(10, 20);

        Square s = new Square();
        s.getArea(2, 3);
    }
}

interface Polygon {
    void getArea(int length, int breadth);
}

class Square implements Polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println(3.14 * length * breadth);
    }
}

class Rectangle implements Polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of rectangle is " + (length * breadth));
    }
}