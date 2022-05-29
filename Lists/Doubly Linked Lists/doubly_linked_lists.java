public class doubly_linked_lists {
    Node head; //head of list

    // Doubly likned list node
    class Node{
        int data;
        Node prev;
        Node next;

        // Costructor to create a new node
        // next and prev is by default initialized as null
        Node(int d){
            data = d;
        }
    }

    // Adding a node at the front of the list
    public void begin(int new_data){
        // 1. allocate node
        // 2. put in the data
        Node new_Node = new Node(new_data);
        // 3. Make next of new_node as head, and previouys as NULL
        new_Node.next = head;
        new_Node.prev = null;
        // 4. change prev of head node to a new node
        if (head != null) {
            head.prev = new_Node;
        }
        // 5. Move the head to point to the new node
        head = new_Node;
    }

    // Add a node before the given node
    public void InsertBefore(Node next_node, int new_data)
    {
        // Check if the given next_node is null
        if (next_node == null) {
            System.out.println("The iven next node cannot be NULL");
            return;
        }

        // Allocate node, put in the data
        Node new_node = new Node(new_data);

        // Making prev of new node as prev of next node
        new_node.prev = next_node.prev;

        // Making prev of next node as new node
        next_node.prev = new_node;

        // Making next of new node as next node
        new_node.next = next_node;

        // Check if new node is added as head
        if(new_node.prev != null){
            new_node.prev.next = new_node;
        }
        else{
            head = new_node;}
    }

    // Give a node as prev_node, insert a new node after the given node
    public void InsertAfter(Node prev_Node, int new_data) {
        // 1. check if the prev node is null
        if (prev_Node == null){
            System.out.println("The given previous node cannot be NULL");
            return;
        }
        // 2. Allocate node
        // 3. put in the data
        Node new_node = new Node(new_data);

        // 4. Make next of new nodes as next of previous nodes
        new_node.next = prev_Node.next;

        // 5. Make the next of previous node as new node
        prev_Node.next = new_node;

        // 6. Make prev_node as previous of new node 
        new_node.prev = prev_Node;

        // 7. Change previous of new node's next node
        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }
    }

    // Add a node at the end of the list
    void append(int new_data){
        // 1. allocate node 
        // 2. put in the data
        Node new_node = new Node(new_data);
        Node last = head; // used in step 5
        // 3. This new node is going to be the last node, so make the next of it as null
        new_node.next = null;
        // 4. If the linked list is empty then make the new node as head
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
        // 5. Else traverse till the last node 
        while (last.next != null) {
            last = last.next;
        }
        // 6. Change the next of last node
        last.next = new_node;
        // 7. Make last node as previous of new node
        new_node.prev = last;
    }

    // This function prints contents of linked lists starting from the given node
    public static void printlist(Node node){
        Node last = null;
        System.out.println("Traversal in forward direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        // Start with the empty list
        doubly_linked_lists dll = new doubly_linked_lists();

        // Insert 6. So linked list becomes 6->NULL
        dll.append(6);
        // Insert 7 at the beginning so linked list becomes 7->6->NULL
        dll.begin(7);
        // Insert 1 at the beginning so linked list becomes 1->7->6->NULL
        dll.begin(1);
        // Insert 4 at the end so linked list becomes 1->7->6->4->NULL
        dll.append(4);
        // Insert 8 after 7 so linked list becomes 1->7->8->6->4->NULL
        dll.InsertAfter(dll.head.next, 8);
        // Insert 5 before 8 so linked list becomes 1->7->5->8->6->4->NULL
        dll.InsertAfter(dll.head.next.next, 5);

        System.out.println("Created Doubly Linked List is: ");
        doubly_linked_lists.printlist(dll.head);
    }

}
