//==========we can access only the object created class and the main class, the extends will be always main class==========

class cars
{
    void brands()
    {
        System.out.println("There are many brands in car!!");
    }
}

class BMW extends cars
{
    void look()
    {
        System.out.println("The BMW is one of the most luxury car in the world!!");
    }
}

class Mahendra extends cars
{
    void vintage()
    {
        System.out.println("Mahendra is some of the vintage brand in india!!");
    }
}

public class hierarchyinheritance
{
    public static void main(String[] args) 
    {
        Mahendra thar=new Mahendra();
        thar.vintage();
        thar.brands();
        BMW i8=new BMW();
        i8.look();
        i8.brands();
    }
}
