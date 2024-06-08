package Weekend3;

public class Interfaces {
    public static void main(String[] args) {
        Square sq = new Square();
        Circle cr = new Circle();
        sq.setSide(4);
        System.out.println("Area of Square: " + sq.area());
        cr.setRadius(5);
        System.out.println("Area of circle: " + cr.area());
    }
}

class MathConstants {
    public static double PI = 3.14;

}

interface Shape {
    double area();
}

class Square implements Shape {
    int side;
    public double area() {
        return MathConstants.PI*side*side;
    }
    public int setSide(int side){
        this.side = side;
        return 0;
    }
}

class Circle implements Shape {
    int radius;
    public double area() {
        return MathConstants.PI*radius*radius;
    }

    public int setRadius(int radius){
        this.radius = radius;
        return 0;
    }
}