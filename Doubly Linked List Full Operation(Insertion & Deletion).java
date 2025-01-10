import java.util.*;

class Node
{
    int data;
    Node next;
    Node prev;

    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DLLFullOperation
{
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
            New.prev=temp;

        }
        return head;
    }

    public static Node InsertAtBegin(int data,Node head)
    {
        Node New=new Node(data);
        if(head==null)
        {
            head=New;
        }
        else
        {
            head.prev=New;
            New.next=head;
            head=New;
        }
        return head;
    }

    public static Node InsertAtPosition(int pos,int data,Node head)
    {
        Node New=new Node(data);
        if(pos==1)
        {
            head = InsertAtBegin(data,head);
        }
        if(head==null)
        {
            head=New;
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
                    temp.next.prev=New;
                    New.next=temp.next;
                    temp.next=New;
                    New.prev=temp;
                }
                temp=temp.next;
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
        if(head==null)
        {
            System.out.println("List is Empty!!");
        }
        else if(pos==1)
        {
            head = DeleteAtBegin(head);
        }
        else
        {
            int count = 1;
            Node temp = head;
            while (temp.next!=null) 
            {
                Node temp1 = temp.next;
                count++;
                if(count==pos)
                {
                    temp.next = temp1.next;
                    temp1.next.prev = temp;
                    temp1.next = null;
                    temp1.prev = null;
                    break;
                }
                temp = temp.next;    
            }
            if(temp.next==null && (count+1)==pos)
            {
                head = DeleteAtEnd(head);
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
    public static void main(String[] args)
    {
        Node head=null;
        // head.next=new Node(20);
        // head.next.prev=head;
        // head.next.next=new Node(30);
        // head.next.next.prev=head.next;
        // head.next.next.next=new Node(40);
        // head.next.next.next.prev=head.next.next;
        // display(head);

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no.of items to insert: ");
        int n=scan.nextInt();
        System.out.println("Enter the Elements: ");
        for(int i=0;i<n;i++)
        {
            head = InsertAtEnd(scan.nextInt(), head);
        }
        display(head);
        System.out.println("Enter Element to insert Begining: ");
        head = InsertAtBegin(scan.nextInt(), head);
        display(head);
        System.out.println("Enter the position: ");
        int a=scan.nextInt();
        System.out.println("Enter the Element to insert: ");
        int b=scan.nextInt();
        head = InsertAtPosition(a,b, head);
        display(head);
        System.out.println("Deleting At Begining: ");
        head = DeleteAtBegin(head);
        display(head);
        System.out.println("Deleting At End: ");
        head = DeleteAtEnd(head);
        display(head);
        System.out.println("Enter the Position to Delete: ");
        int c=scan.nextInt();
        head = DeleteAtPosition(c,head);
        display(head);
    }
}
