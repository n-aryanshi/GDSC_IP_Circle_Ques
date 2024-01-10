class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class rotateAnticlockwise {
    public static void insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public static void display(Node head) {
        System.out.println("Doubly linked list:");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static int getSize(Node head){
        int size=0;
        Node temp=head;
        while(temp!=null) {
            size++;
            temp=temp.next;
        }
        return size;
    }
    public static Node getTailNode(Node head){
        Node temp = head;
        while(temp.next!=null) temp=temp.next;
        return temp;
    }
    public static Node getKNode(Node head ,int k){
        Node temp=head;
        for(int i=0 ;i<k ;i++){
            temp = temp.next;
        }
        return temp;
    }

    public static Node rotateK(Node head , int k){
        if(k==0) return head;
        int size = getSize(head);
        k=k%size;
        if(k==0) return head;

        Node tail = getTailNode(head);
        Node kNode=  getKNode(head , k);

        Node prevK = kNode.prev; //k-1 th node
        prevK.next = null;
        kNode.prev = null;

        head.prev =tail;
        tail.next =head;

        head=kNode;
        return head;

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        insertAtEnd(head ,2);
        insertAtEnd(head ,3);
        insertAtEnd(head ,4);
        insertAtEnd(head ,5);
        insertAtEnd(head ,6);
        display(head);

        head =rotateK(head , 4);
        display(head);



    }
}
