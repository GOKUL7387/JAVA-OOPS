public class IllegalArgument
{
    public static void main(String[] args) 
    {
        try 
        {
            Thread.sleep(-100); // Throws IllegalArgumentException
        } 
        catch (IllegalArgumentException | InterruptedException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}