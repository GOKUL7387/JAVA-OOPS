class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class SLLInsertionAtMiddle
{
    Node head;
    SLLInsertionAtMiddle()
    {
        this.head=null;
    }

    //Insertion At Begining
    void insertAtBeginning(int data)
    {
        Node nb=new Node(data);
        nb.next=head;
        head=nb;
    }

    //Insertion At Middle
    void InsertAtMiddle(int pos,int data)
    {
        Node nn=new Node(data);
        Node temp=head;
        for(int i=1;i<pos-1;i++)
        {
            if(temp!=null)
            {
                temp=temp.next;
            }
        }
        if(temp!=null)
        {
            nn.next=temp.next;
            temp.next=nn;
        }
        if(temp==null)
        {
            temp.next=nn;
        }

        
    }

    //Insertion At End
    void insertAtEnd(int data) 
        {
            Node nb = new Node(data);
            if (head == null) 
            {
                head = nb;
                return;
            }
            Node temp = head;
            while (temp.next != null) 
            {
                temp = temp.next;
            }
            temp.next = nb;
        }

    void display()
    {
        if(head==null)
        {
            System.out.println("List is Empty!");
        }
        else
        {
            Node temp=head;
            while(temp != null)
            {
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) 
    {
        SLLInsertionAtMiddle list=new SLLInsertionAtMiddle();

        Node n = new Node(10);
        list.head = n;
        Node n1 = new Node(20);
        n.next = n1;
        Node n2 = new Node(30);
        n1.next = n2;
        Node n3 = new Node(40);
        n2.next = n3;
        Node n4 = new Node(50);
        n3.next = n4;

        list.display();
        list.InsertAtMiddle(2,35);
        list.display();
        list.insertAtEnd(56);
        list.display();
        list.insertAtBeginning(5);
        list.display();
    }
}
