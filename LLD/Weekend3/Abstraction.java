package Weekend3;

public class Abstraction {
}


abstract class Animal {
    public abstract void makeSound();
    public void sleep() {
        System.out.println("Sleeping......");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!!!");
    }
}



