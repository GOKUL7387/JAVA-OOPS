class constructors
{
    String name;
    int age;

    //parametrized constructor
    public constructors(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    //copy constructor
    public constructors(constructors a)
    {
        this.name=a.name;
        this.age=a.age;
    }

    //No-argument constructor
    public constructors()
    {
        this.name=null;
        this.age=0;
    }

    public void display()
    {
        System.out.println("name: "+name+" age: "+age);
    }

    public static void main(String[] args) 
    {
        constructors x=new constructors("ezhil",20);
        constructors y=new constructors();
        x.display();
        y.display();
    }
}
