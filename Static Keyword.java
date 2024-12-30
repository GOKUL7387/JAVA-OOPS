class mobile
{
    String brand;
    int price;
    static String name;

    public void display()
    {
        System.out.println(brand+" "+name+" priced at "+ price);
    }

    public static void show(mobile obj)
    {
        System.out.println(obj.brand+" "+name+" priced at "+ obj.price);
    }

    public static void main(String[] args) 
    {
        mobile obj=new mobile();
        mobile obj1=new mobile();
        obj.brand="moto";
        obj.price=10000;
        mobile.name="smartphone";
        obj.display();
        obj1.brand="samsung";
        obj1.price=50000;
        mobile.show(obj1);
    }
}
