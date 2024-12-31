//==========The extends will be one by one.so can be access all the class with single object==========

class bikes
{
    void riders()
    {
        System.out.println("All riders will ride the bike safely !!");
    }
}

class Royal_enfield extends bikes
{
    void tourqe()
    {
        System.out.println("GT650 produce raw power");
    }
}

class Ninja extends Royal_enfield
{
    void speed()
    {
        System.out.println("One of the fastest bike!!");
    }
}

public class multilevelinheritance
{
    public static void main(String[] args) 
    {
        Ninja bike1=new Ninja();
        bike1.riders();
        bike1.tourqe();
        bike1.speed();
    }
}
