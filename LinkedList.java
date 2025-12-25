
class Node {
    
    int data;
    Node next;
    
    public Node (int data1){
        data=data1;
        next=null;
    }
    
}

public class Main
{
    static Node head;
    
   public static Node insertFirst(int data){
        Node temp=new Node(data);
        return temp;
   } 
   
    
    public static void insertLast(int data){
        
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        Node temp=new Node(data);
       curr.next=temp;
        
    }
    
    public static void insertMiddle(int data,int pos){
        Node curr=head;int i=1;
        while(i<pos-1){
            curr=curr.next;
            i++;
        }
        Node temp=new Node(data);
        temp.next=curr.next;
        curr.next=temp;
    }
   
   public static void print(){
       Node temp=head;
    System.out.print(temp.data);
    while(temp.next!=null)
    {
        
        temp=temp.next;
        System.out.print("->"+temp.data);
    }
        
    }
   
	public static void main(String[] args) {
		System.out.println("Linked List:\n Insert first element:5");
    
    head=insertFirst(5);
    print();
    System.out.println();
    insertLast(11);
    print();
    System.out.println();
    insertLast(17);
    print();
    System.out.println();
    insertMiddle(12,3);
    print();
    
    
    
	}
}
