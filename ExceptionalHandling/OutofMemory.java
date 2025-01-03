public class OutofMemory 
{
    public static void main(String[] args) 
    {
        try 
        {
            int[] arr = new int[Integer.MAX_VALUE]; // Throws OutOfMemoryError
        } 
        catch (OutOfMemoryError e) 
        {
            System.out.println("OutOfMemoryError caught: " + e.getMessage());
        }
    }
}