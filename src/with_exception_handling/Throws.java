package with_exception_handling;

public class Throws {

    public static void demo() throws InterruptedException, IllegalAccessException {

        int a = 20;

        if(a == 10)
        {
            throw new ArithmeticException("a is 10 and it is unchecked exception");
        }
        if(a == 20)
        {
            throw new InterruptedException("a is 20 and it is checked exception");
        }
        if(a == 30)
        {
            throw new RuntimeException("a is 30 and it is unchecked exception");
        }
        if(a == 40)
        {
            throw new IllegalAccessException("a is 40 and it is checked exception");
        }
    }

    public static void main(String[] args) {

        try
        {
            Throws.demo();
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred : " + e.getMessage() + " --- " + e.getClass());
        }
    }
}
