class employee
{
    private int id;
    private String name;
    private  double salary;

    public employee(int id, String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    //No-argument
    public employee()
    {
        this.id=0;
        this.name="";
        this.salary=0;
    }

    //=======another method for access private key=======

    //two method->set & get

    //GET   (to access induvidual)
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    //SET

    public void setId(int id)
    {
        if(id>0)
        {
            this.id=id;
        }
        else
        {
            System.out.println("Invalid id !");
        }
    }

    public void setName(String name)
    {
        if(! name.isEmpty())
        {
            this.name=name;
        }
        else
        {
            System.out.println("Invalid name !!");
        }
    }

    public void setSalary(double  salary)
    {
        if(salary>0)
        {
            this.salary=salary;
        }
        else
        {
            System.out.println("Invalid salary !!");
        }
    }

    public void display()
    {
        System.out.println("id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println();
    }

    public static void main(String[] args)
    {
        employee emp1=new employee(01,"ezhil",70000);
        employee emp2=new employee();
        System.out.println("==== Employee1 ====");
        emp1.display();
        emp2.setId(02);
        emp2.setName("Akash");
        emp2.setSalary(50000);
        System.out.println("==== Employee2 ====");
        emp2.display();
        System.out.println("==== Details ====");
        System.out.println("Employee 1 name: "+emp1.getName());
        System.out.println("Employee 2 name: "+emp2.getName());
        
    }
}
