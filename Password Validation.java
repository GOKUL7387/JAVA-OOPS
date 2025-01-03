public class Passwordvalidation
{
    public static void main(String[] args)
    {
        String password="Maverick@123";
        String passvalidation="^((?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%&])).{8,}$";
        if(password.matches(passvalidation))
        {
            System.out.println("Password is valid");
        }
        else
        {
            System.out.println("Password is invalid");
        }
    }
}
