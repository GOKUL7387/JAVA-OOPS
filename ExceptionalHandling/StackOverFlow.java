public class StackOverFlow {
    public static void main(String[] args) 
    {
        try 
        {
            recursiveMethod(); // Throws StackOverflowError
        } 
        catch (StackOverflowError e) 
        {
            System.out.println("StackOverflowError caught: " + e.getMessage());
        }
    }

    public static void recursiveMethod() 
    {
        recursiveMethod(); // Infinite recursion
    }
}