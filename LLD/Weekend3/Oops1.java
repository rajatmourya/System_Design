package Weekend3;

public class Oops1 {
    public static void main(String[] args) {
        Person person = new Person("Rohit", 32);   //  object
        boolean isHeAbleTowalk = person.canWalk();
        System.out.println(isHeAbleTowalk);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    boolean canWalk() {
        if(age > 1) return true;
        return false;
    }

}

