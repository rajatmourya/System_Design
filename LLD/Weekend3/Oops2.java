package Weekend3;

class Car {
    private String color;
    private int speed;

    public void accelarate() {
        speed++;
    }

    public void applyBrake() {
        speed--;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        this.color = color;
        return null;
    }

    public int setSpeed(int speed){
        this.speed = speed;
        return 0;
    }

}

public class Oops2 {
    public static void main(String[] agrs){
        Car myCar = new Car();
        myCar.setColor("red");
        myCar.setSpeed(60);
        System.out.println( myCar.getColor());
        System.out.println("Before Acceleration speed is: " + myCar.getSpeed());
        myCar.accelarate();
        myCar.accelarate();
        System.out.println("After Acceleration speed is: " + myCar.getSpeed());


    }
}


