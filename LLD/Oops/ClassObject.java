package Oops;

public class ClassObject {
    public static void main(String[] args) {
        person rohit = new person();
        rohit.setName("Rohit");
        rohit.greet();
    }



}

class person {
    private String name;
    private int age;

    void greet() {
        System.out.println("Hello !!!" + name);
    }

    void setName(String name) {
        this.name = name;
    }
}


