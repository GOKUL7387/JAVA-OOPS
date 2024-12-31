//==========Same function in different class==========

class animal
{
    void sound()
    {
        System.out.println("Animal makes sound!");
    }
}

class Lion extends animal
{
    @Override
    void sound()
    {
        System.out.println("King of the Jungle !");
    }
}

public class MethodOverriding
{
    public static void main(String[] args)
    {
        Lion a1=new Lion();
        animal a2=new animal();
        a1.sound();
        a2.sound();
    }
}
