public class doubly_linked_lists_create {
    
    Node head; //head of list
    Node A = new Node(6);
    Node B = new Node(6);
    Node C = new Node(6);
    Node D = new Node(6);
    Node E = new Node(6);
    Node F = new Node(6);
    Node G = new Node(6);
    Node I = new Node(6);

    // Doubly linked list node
    /**
     * Node
     */
    class Node {
        int data;
        Node prev;
        Node next;
        Node(int d){
            data = d;
        }        
    }

    public void create(){
        head = A;
        A.next = B;
        A.prev = head;
        B.next = C;
        B.prev = A;
        C.next = D;
        C.prev = B;
        D.next = E;
        D.prev = C;
        E.next = F;
        E.prev = D;
    }
    public void begin(Node new_Node)
    {
        new_Node.next = head;
        new_Node.prev = null;

        if (head != null) {
            head.prev = new_Node;
            head = new_Node;
        }
    }

    public void InsertBefore(Node next_node, Node new_node){
        if(next_node == null)
        {
            System.out.println("The given next node cannot be NULL.");
            return;
        }

        new_node.prev = next_node.prev;
        next_node.prev = new_node;
        new_node.next = next_node;
        if(new_node.prev != null){
            new_node.prev.next = new_node;
        }
        else{
            head = new_node;
        }
    }

    public void delete(Node node){
        if(node == null || head == null){
            System.out.println("Cannot find the node");
            return;
        }
        if (node == head) {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
        }
    }

    public void printlist(Node node){
        Node last = null;
        while (node != null){
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        
        doubly_linked_lists_create link = new doubly_linked_lists_create();

        link.create();
        link.printlist(link.head);
        link.begin(link.G);
        link.printlist(link.head);
        link.InsertBefore(link.B, link.I);
        link.printlist(link.head);
        link.delete(link.E);
        link.printlist(link.head);
    }
}