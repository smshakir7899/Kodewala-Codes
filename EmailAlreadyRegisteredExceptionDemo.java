
class EmailAlreadyRegisteredException extends Exception
{
    public EmailAlreadyRegisteredException(String message)
    {
        super(message);
    }
}

public class EmailAlreadyRegisteredExceptionDemo
{
    public static void main(String[] args) {
        try {
            String user = "Kodewala";
            if (user.equals("Kodewala")) {
                throw new EmailAlreadyRegisteredException("Email Already Exist in the system.");
            }
        }
        catch (EmailAlreadyRegisteredException e)
        {
            System.out.println(e.getMessage());
        }
    }
}


