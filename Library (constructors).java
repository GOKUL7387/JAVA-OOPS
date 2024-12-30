class library
{
    String title;
    String author;
    boolean available;

    //parametrized constructor
    public library(String title, String author)
    {
        this.title=title;
        this.author=author;
    }

    //copy constructor
    public library(library a)
    {
        this.title=a.title;
        this.author=a.author;
    }

    //No-argument constructor
    public library()
    {
        this.title=title;
        this.author=author;
    }

    public void display()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.err.println("Available: "+((available)?"yes":"no"));
    }
    public void borrow()
    {
        if(available)
        {
            System.out.println(title+" is available");
            available=false;
        }
        else
        {
            System.out.println(title+" is not available");
        }
    }
    public void Return()
    {
        available=true;
        System.out.println(title+" is currently available");
    }
    public static void main(String[] args) 
    {
        library book1=new library("java","James Gosling");
        library book2=new library("c++","Bjarne Stroustrup");
        book1.display();
        book2.display();
        book1.borrow();
        book1.Return();
    }
}
