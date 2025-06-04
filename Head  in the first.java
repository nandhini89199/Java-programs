class Node
{
    int data;
    Node next;
    Node(int n)
    {
        this.data=n;
        this.next=null;
    }
}
class LinkedList
{
    Node head=null;
    void add(int n)
    {
        Node newNode=new Node(n);
        if(head==null)
        {
            head=newNode;
        }
        else{
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }
    void addf(int n)
    {
        Node newNode=new Node(n);
        newNode.next=head;
        this.head=newNode;
    }
    void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	 LinkedList l=new LinkedList();
	 l.add(1);
	 l.add(2);
	 l.add(3);
	 l.addf(4);
	 l.addf(5);
	 l.display();
	}
}