//You are given the size of total nodes contained in a linked list. You have to create a linked list and print Values present in the linked list in reverse order.
import java.util.*;
class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
    }
}
public class begnode
{
    node head;
    public void insertAtBeg(int data)
    {
        node n = new node(data);
        if(head==null)
        {
            head=n;
        }
        else{
            n.next=head;
            head=n;
        }
    }
    public void printm()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        begnode obj=new begnode();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            int number=sc.nextInt();
            obj.insertAtBeg(number);
        }
        obj.printm();
    }
}