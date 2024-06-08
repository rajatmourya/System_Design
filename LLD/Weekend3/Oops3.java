package Weekend3;

class Constants {
    public static double PI = 3.14;
    public static double EXPONENT = 2.73;
}

class Test {
    static class TestInner {

    }
}

public class Oops3 {
    public static void main(String[] args) {
        double a = Constants.EXPONENT;
        System.out.println(a);
        new Test.TestInner();
        double pi = Constants.PI;
        System.out.println(pi);
    }
}
