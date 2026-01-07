package user_defined_custom_exception;

public class SampleClass {
    public static void main(String[] args) {

        try
        {
            String user = null;     // search the user from database
            if(user != null)
            {
                System.out.println("User is " + user);
            }
            else
            {
                throw new UserNotFoundException("user not found!!");
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred : " + e.getMessage() + " --- " + e.getClass());
        }
    }
}
