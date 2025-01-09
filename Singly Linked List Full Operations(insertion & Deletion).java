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

public class SLLFullOperation
{

    public static Node InsertAtBegin(int data,Node head)
    {
        Node New=new Node(data);
        if(head==null)
        {
            head=New;
        }
        else
        {
            New.next=head;
            head=New;
        }
        return head;
    }

    public static Node InsertAtEnd(int data,Node head)
    {
        Node New=new Node(data);
        if(head==null)
        {
            head=New;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=New;
        }
        return head;
    }

    public static Node InsertAtPosition(int pos,int data,Node head)
    {
        Node New=new Node(data);
        if(head==null)
        {
            head=New;
        }
        else if(pos==1)
        {
            head=InsertAtBegin(data, head);
        }
        else
        {
            Node temp=head;
            int count=1;
            while(temp.next!=null)
            {
                count++;
                if(count==pos)
                {
                    break;
                }
                temp=temp.next;
            }
            if(count==pos)
            {
                New.next=temp.next;
                temp.next=New;
            }
        }
        return head;
    }

    public static Node DeleteAtBegin(Node head)
    {
        if(head==null)
        {
            System.out.println("List is Empty!!");
        }
        else
        {
            head=head.next;
        }
        return head;
    }

    public static Node DeleteAtEnd(Node head)
    {
        if(head==null)
        {
            System.out.println("List is Empty!!");
        }
        else
        {
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
        return head;
    }

    public static Node DeleteAtPosition(int pos,Node head)
    {
        if(head == null)
        {
            System.out.print("Empty list");
        }
        else
        {
           Node temp = head;
           int count = 1;
           while(temp.next!=null)
           {
               Node temp1=temp.next;
               count++;
               if(count == pos)
               {
                   temp.next=temp1.next;
                   temp1=null;
               }
               temp=temp.next;
           }
           if(pos == 1)
           {
               head = DeleteAtBegin(head);
           }
        }
        return head;

    }

    
    public static void display(Node head)
    {
        if(head==null)
        {
            System.out.println("List is Empty!!");
        }
        else
        {
            while(head!=null)
            {
                System.out.print(head.data+"-->");
                head=head.next;
            }
            System.out.println("NULL");   
        }
    }

    public static Node SearchAndDelete(int data,Node head)
    {
        Node temp = head;
        int count = 1;
        while(temp.next!=null)
        {
            if(temp.data==data)
            {
            count++;
            System.out.println("yes");
            head = DeleteAtPosition(count+1, head);
            }
            temp=temp.next;
        }
        if(count==1)
        {
            System.out.println("no");
        }
        return head;
    }
    public static void main(String[] args) 
    {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head = InsertAtBegin(5, head);
        display(head);
        head = InsertAtEnd(45, head);
        display(head);
        head = InsertAtPosition(4,25,head);
        display(head);
        head = DeleteAtBegin(head);
        display(head);
        head = DeleteAtEnd(head);
        display(head);
        head = DeleteAtPosition(2, head);
        display(head);
        head = SearchAndDelete(10, head);
        display(head);
    }
}
