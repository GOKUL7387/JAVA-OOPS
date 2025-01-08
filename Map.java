
import java.util.*;

public class MapExample
{
    public static void main(String[] args) 
    {
        //interface                        //class
        Map<String,Integer> playerScore=new HashMap<>();

        //Put method
        playerScore.put("Virat",85);
        playerScore.put("Rohit",120);
        playerScore.put("Raina",54);
        playerScore.put("Yuvaraj",125);
        //it updates the last value for the key...
        playerScore.put("Raina",92);

        System.out.println("After Put() Method: "+playerScore);

        //Put All method
        Map<String,Integer> AdditionalScore=new HashMap<>();
        AdditionalScore.put("Dhawan",52);
        AdditionalScore.put("Jadeja",70);
        playerScore.putAll(AdditionalScore);
        System.out.println("After PutAll() Method: "+playerScore);

        //putifabsent Method
        playerScore.putIfAbsent("Virat", 85);
        playerScore.putIfAbsent("Hardik",56);
        System.out.println("After putIfAbsent() Method: "+playerScore);

        //get method
        System.out.println("The Score of Raina is: "+playerScore.get("Raina"));

        //getOrDefault method

        //Chahal is not in the map so, it print the Default value...
        System.out.println("Score of Unknown Player: "+playerScore.getOrDefault("Chahal",0));
        //Virat is in the map so, it print the orginal value...
        System.out.println("Score of Unknown Player: "+playerScore.getOrDefault("Virat",0));

        //containsKey method
        System.out.println("Does Raina Exist!: "+playerScore.containsKey("Raina"));
        System.out.println("Does DK Exist!: "+playerScore.containsKey("DK"));

        //containsValue method
        System.out.println("Does Raina Scored 92!: "+playerScore.containsValue(92));
        System.out.println("Does Dhawan Scored 100!: "+playerScore.containsValue(100));

        //replace method
        playerScore.replace("Rohit", 110);
        //Initially rohit score is 120 after replacing rohit score is 110....
        System.out.println("After Replacing(key,value): "+playerScore);

        //Same as normal replace..but using(key,oldvalue,newvalue)..
        playerScore.replace("Yuvaraj",125,130);
        System.out.println("After Replacing(key,oldvalue,newvalue):"+playerScore);

        //remove method
        //remove using key...
        playerScore.remove("Jadeja");
        System.out.println("Afetr Removing Jadeja: "+playerScore);

        //remove using key and value...
        playerScore.remove("Hardik", 56);
        System.out.println("After removing Hardik: "+playerScore);

        //To Display all the key...
        Collection<String> key=playerScore.keySet();
        System.out.println("players: "+key);

        //Tp display all the Values...
        Collection<Integer> value=playerScore.values();
        System.out.println("players: "+value);

        //To display as an specific Order.....
        Set<Map.Entry<String,Integer>> score=playerScore.entrySet();
        System.out.println("===========SCORE CARD===========");
        for(Map.Entry<String,Integer> entries : score)
        {
             System.out.println(entries.getKey()+" : "+entries.getValue());
        }
    }
}
