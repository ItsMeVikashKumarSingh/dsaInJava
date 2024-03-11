public class Node {
int data;
Node next;

public Node Head = new Node();
public void addNew(int data)
{
    Node node ;
    node = new Node();
    node.data=data;
    node.next = null; 
    Head = node;
}
}


// public void addNew(int data) {
//     Node newNode = new Node();
//     newNode.data = data;
//     newNode.next = null;

//     if (Head == null) {
//         Head = newNode;
//         return;
//     }

//     Node current = Head;
//     // Traverse the list to find the last node
//     while (current.next != null) {
//         current = current.next;
//     }
//     // Set the last node's next to the new node
//     current.next = newNode;
// }
