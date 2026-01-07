package without_exception_handling;

public class Demo {
    // exception unhandled scenario
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int res = 0;

        res = a / b;

        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
        System.out.println("res is : " + res);
    }
}
