public class CharArrayExample 
{
    public static void main(String[] args) 
    {
        // Original string
        String str = "Hello, Java!";
        
        // Converting string to character array
        char[] charArray = str.toCharArray();
        
        // Printing the character array
        System.out.println("Character Array: ");
        for (char ch : charArray) 
        {
            System.out.print(ch+" ");
        }

        // Example: Counting vowels in the string
        int vowelCount = 0;
        for (char ch : charArray) 
        {
            if ("AEIOUaeiou".indexOf(ch) != -1) 
            {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        // Example: Sorting the characters in the array
        java.util.Arrays.sort(charArray);
        System.out.println("Sorted Character Array: " + new String(charArray));
    }
}
