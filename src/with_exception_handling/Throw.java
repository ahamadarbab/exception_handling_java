package with_exception_handling;

public class Throw {
    public static void main(String[] args) {

        try
        {
            int a = 20;
            if(a != 20)
            {
                System.out.println("a is not 20, hence not throwing the exception");
            }
            else
            {
                // throwing exception when a is 20
                throw new RuntimeException("a is 20, hence manually throwing the exception");
            }
        }
        // handling the exception using catch block
        catch (Exception e)
        {
            System.out.println("Exception occurred : " + e.getMessage() + " --- " + e.getClass());
        }

    }
}
