package with_exception_handling;

public class Finally {

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
            System.out.println("Exception occurred : " + e.getMessage() + " --- " + e.getClass());
        }

        finally
        {
            System.out.println("a is : " + a);
            System.out.println("b is : " + b);
            System.out.println("res is : " + res);
        }
    }
}
