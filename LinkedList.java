/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

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
        while(i<pos-1&&curr.next!=null){
            curr=curr.next;
            i++;
        }
        if(curr.next==null)
        {
            System.out.println("Cant insert at position"+pos);
            return;
        }
        Node temp=new Node(data);
        temp.next=curr.next;
        curr.next=temp;
    }
   
   public static void deleteFirst(){
       if(head==null)
       return;
       Node temp=head.next;
       head.next=null;
       head=temp;
   }
   
   public static void deleteLast(){
       if(head==null)
       return;
       Node temp=head;
       while(temp.next.next!=null){
           temp=temp.next;
       }
       temp.next=null;
   }
   
   public static void deleteAtPos(int pos){
       if(head==null)
       return;
       Node curr=head;int i=1;
        while(i<pos-1&&curr.next!=null){
            curr=curr.next;
            i++;
        }
        if(curr.next==null)
        {
            System.out.println("Cant delete at position"+pos);
            return;
        }
        Node temp=curr.next.next;
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
       System.out.println(); 
    }
   
	public static void main(String[] args) {
		System.out.println("Linked List:\n Insert first element:5");
    
    head=insertFirst(5);
    print();
    insertLast(11);
    print();
    insertLast(17);
    print();
    insertMiddle(12,3);
    print();
    insertMiddle(2,1);
    print();
    deleteFirst();
    print();
    deleteLast();
    print();
    deleteAtPos(3);
    print();
    insertMiddle(12,13);
    print();
	}
}
