package with_exception_handling;

public class MultipleCatch {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int res = 0;

       try
       {
           res = a / b;
           System.out.println("res is : " + res);

           String msg1 = "Hello";
           String msg2 = null;
           System.out.println("Length of msg1 is : " + msg1.length());
           System.out.println("Length of msg2 is : " + msg2.length());
       }

       catch (ArithmeticException e)
       {
           System.out.println("Exception occurred : " + e.getMessage() + " --- " + e.getClass());
       }
       catch (NullPointerException e)
       {
           System.out.println("Exception occurred : " + e.getMessage() + " --- " + e.getClass());
       }

        // Instead of writing multiple catch block to handle different kind of exception,
        // we write a generic catch block which will handle all type of exceptions
        //catch (Exception e)
        //{
        //    System.out.println("Exception occurred : " + e.getMessage() + "---" + e.getClass());
        //}
    }
}
