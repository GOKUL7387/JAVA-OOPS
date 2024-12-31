//==========Same function name in same class==========

class calculator
{
    void sum(int a, int b)
    {
        int sum=a+b;
        System.out.println("Total sum: "+sum);
    }

    void sum(int a, int b, int c)
    {
        int sum=a+b+c;
        System.out.println("Total sum: "+sum);
    }

    void sum(int a, int b, int c,int d)
    {
        int sum=a+b+c+d;
        System.out.println("Total sum: "+sum);
    }
}

public class MethonOverloading
{
    public static void main(String[] args) 
    {
        calculator operation=new calculator();
        operation.sum(2,3);
        operation.sum(2,5,7);
        operation.sum(0,1,2,0);
    }
}
