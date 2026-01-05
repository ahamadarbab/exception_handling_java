package with_exception_handling;

public class tryCatch {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int res = 0;

        try
        {
            System.out.println("Inside the try block before division operation");
            res = a / b;
            System.out.println("Inside the try block after division operation");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception occured : " + e.getMessage() + "---" + e.getClass());
        }

        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
        System.out.println("res is : " + res);
    }
}
