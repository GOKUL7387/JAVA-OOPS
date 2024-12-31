//============we can directly access the parent class using derived class============

class animal
{
    void eat()
    {
        System.out.println("All animals will eat !");
    }
}
class dog extends animal
{
    void bark()
    {
        System.out.println("Dogs will bark");
    }
}
public class singleinheritance
{
    public static void main(String[] args) 
    {
        dog d1=new dog();
        d1.eat();
        d1.bark();
    }
}
