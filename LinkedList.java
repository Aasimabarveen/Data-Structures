class Node {
    
    int data;
    Node next;
    
    public Node createNode(int data){
        Node temp=new Node();
       temp.data=data;
        temp.next=null;
        return temp; 
    }
    
    public Node insertFirst(int data){
        return createNode(data);
    }
    
    public void insertLast(int data,Node head){
        
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
       curr.next=createNode(data);
        
    }
    
    public void insertMiddle(int data,int pos, Node head){
        Node curr=head;int i=1;
        while(i<pos-1){
            curr=curr.next;
            i++;
        }
        Node temp=new Node();
        temp.data=data;
        temp.next=curr.next;
        curr.next=temp;
    }
    
    public void print(Node head){
    Node temp=head;
    System.out.print(temp.data);
    while(temp.next!=null)
    {
        
        temp=temp.next;
        System.out.print("->"+temp.data);
    }
        
    }
  
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Linked List:\n Insert first element:5");
    Node node=new Node();
    Node head=node.insertFirst(5);
    node.print(head);
    System.out.println();
    node.insertLast(11,head);
    node.print(head);
    System.out.println();
    node.insertLast(17,head);
    node.print(head);
    System.out.println();
    node.insertMiddle(12,3,head);
    node.print(head);
    
	}
}
