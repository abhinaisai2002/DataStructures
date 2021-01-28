import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class LinkedList{
    Node head;
    Scanner sc;
    LinkedList(){
        head = null;
        sc = new Scanner(System.in);
    }
    public void createList(){
        System.out.println("Enter data");
        int data = sc.nextInt();
        head = new Node(data);
    }
    public void insertAtFirst(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    public void insertAtLast(int data){
        Node temp = new Node(data);
        Node t = head;
        while(t.next!=null)
            t = t.next;
        t.next = temp;
    }
    public void insertAtMiddle(int pos,int data){
        Node temp = new Node(data);
        Node t = head;
        for(int i=0;i<pos-1;i++)
            t = t.next;
        temp.next = t.next;
        t.next = temp;
    }
    public void deleteAtFirst(){
        Node t = head;
        head = head.next;
        t.next = null;
        t = null;
    }
    public int length(){
        Node t = head;
        int count = 0;
        while(t!=null){
            count++;
            t = t.next;
        }
        return count;
    }
    public void deleteAtLast(){
        Node x = head;
        Node y = head.next;
        while(y.next!=null){
            x = x.next;
            y = y.next;
        }
        x.next = null;
        y = null;
    }
    public void deleteAtMiddle(int pos){
        Node t = head;
        for(int i=0;i<pos-1;i++)
            t = t.next;
        Node temp = t.next;
        t.next = temp.next;
        temp.next = null;
        temp = null;
    }
    public void search(int data){
        Node t = head;
        while(t!=null){
            if(t.data == data){
                System.out.println("found");
                return ;
            }
            t = t.next;
        }
        System.out.println("not found");
    }
    public void viewList(){
        Node t = head; 
        while(t!=null){
            System.out.print(t.data+"->");
            t = t.next;
        }
        System.out.println();
    } 
    public void sort(){
        Node i;
        Node j;
        int temp;
        for(i = head;i!=null;i = i.next){
            for (j = i.next;j!=null;j = j.next){
                if(i.data > j.data){
                    temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }
    public void reverse(){
        Node current = head;
        Node previous = null;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.createList();
        boolean flag = true;
        while(flag){
            System.out.println("1.insert At First");
            System.out.println("2.insert At Middle");
            System.out.println("3.insert At Last");
            System.out.println("4.delete At First");
            System.out.println("5.delete At Middle");
            System.out.println("6.delete At Last");
            System.out.println("7.length");
            System.out.println("8.search");
            System.out.println("9.sort");
            System.out.println("10.reverse");
            System.out.println("11.viewList");
            System.out.println("12.Exit");
            System.out.println("Enter choice");
            int ch = sc.nextInt();
            switch(ch){
                case 1 : System.out.println("Enter element");
                         list.insertAtFirst(sc.nextInt());
                         break;
                case 2 : System.out.println("Enter element and position");
                         list.insertAtMiddle(sc.nextInt(),sc.nextInt());
                         break;       
                case 3 : System.out.println("Enter element");
                         list.insertAtLast(sc.nextInt());
                         break;           
                case 4 : list.deleteAtFirst();
                         break;           
                case 5 : System.out.println("Enter position");
                        list.deleteAtMiddle(sc.nextInt());
                         break;        
                case 6 : list.deleteAtLast();
                         break;
                case 7 : System.out.println(list.length());
                         break;
                case 8 : System.out.println("Enter element");
                         list.search(sc.nextInt());
                         break;
                case 9 : list.sort();
                         break;
                case 10: list.reverse();break;
                case 11: list.viewList();break;
                case 12: flag = false;break;                  
            }
        }
    }
}