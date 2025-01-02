abstract class vehical
{
    abstract void start();
    abstract void applybreak();

    void stop()
    {
        System.out.println("vehical is stopping");
    }
}

class Car extends vehical
{
    @Override 
    void start()
    {
        System.out.println("vehical is starting");
    }
    @Override
    void applybreak()
    {
        System.out.println("break applied");
    }
}

public class abstraction
{
    public static void main(String[] args) 
    {
        //can't create object for abstract class...
        vehical car=new Car();
        car.start();
        car.applybreak();
        car.stop();
    }
}
