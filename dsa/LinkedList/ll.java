import java.util.HashSet;

public class ll {
    public Node Head = new Node();

    public static void main(String[] args) {
        ll newLinkedList = new ll();
        newLinkedList.Head.addNew(newLinkedList,5);
        newLinkedList.Head.add(newLinkedList,3);
        newLinkedList.Head.add(newLinkedList,4);
        newLinkedList.Head.add(newLinkedList,2,0);
        newLinkedList.Head.add(newLinkedList,3,2);
        newLinkedList.Head.print(newLinkedList);
        System.out.println();
        newLinkedList.Head.removeDuplicate(newLinkedList);
        newLinkedList.Head.print(newLinkedList);
        System.out.println();
        System.out.println(newLinkedList.Head.getFromLast(newLinkedList,4));
        System.out.println();


        ll firstLl = new ll();
        firstLl.Head.addNew(firstLl, 7);
        firstLl.Head.add(firstLl,1);
        firstLl.Head.add(firstLl,5);
        firstLl.Head.print(firstLl);
        System.out.println();

        ll secondLl = new ll();
        secondLl.Head.addNew(secondLl, 2);
        secondLl.Head.add(secondLl,4);
        secondLl.Head.add(secondLl,6);
        secondLl.Head.add(secondLl, 8);
        secondLl.Head.print(secondLl);
        System.out.println();


        ll newLL = new ll();
        newLL = newLL.Head.findSum(firstLl.Head, secondLl.Head);
        newLL.Head.print(newLL);
    } 





    public static class Node {
    int data;
    Node next;

    public void addNew(ll newLl,int data)
    {
        Node node ;
        node = new Node();
        node.data=data;
        node.next = null; 
        newLl.Head = node;
    }

    void add(ll newLl,int data)
    {
        Node temp2= newLl.Head;
        Node temp = new Node();
        temp.data=data;
        temp.next=null;
        if (newLl.Head==null) {
            newLl.Head=temp;
            return;
        }
        while (temp2.next!=null) {
            temp2=temp2.next;
        }
        temp2.next=temp;
    }


    void add(ll newLl,int data,int n)
    { 
        Node temp2= newLl.Head;
        Node temp = new Node();
        temp.data=data;
        temp.next=null;
        if (n==0) {
            temp.next=newLl.Head;
            newLl.Head=temp;
            return;
        }
        for(int i =1; i<n && temp2!=null ;i++) {
            temp2=temp2.next;
        if (temp2==null) {
            System.out.println("Out of bound");
            return;
        }
        temp.next=temp2.next;
        temp2.next=temp;
    }
    }

    public void print(ll newLl)
        {
         Node temp = newLl.Head;
         while (temp != null) {
            System.out.println(temp.data);
            temp=temp.next;
            }
        }

    void removeDuplicate(ll newLl)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        Node temp = newLl.Head;
        Node prevNode=null;
        while (temp != null) {
            if (hashSet.contains(temp.data)) {
                prevNode.next=temp.next;
            }
            else{
            prevNode=temp;
            hashSet.add(temp.data);
            }
            temp=temp.next;
           }
    }


    public int getFromLast(ll newLl,int n)
    {
        Node node = newLl.Head;
        Node prNode=newLl.Head;
        for(int i = 0; i<n;i++)
        {
            node=node.next;
        }
        while (node!=null) {
            node= node.next;
            prNode = prNode.next;
        }
        return prNode.data;
    }



    public ll findSum(Node firstNode, Node secondNode)
    {
        int carry=0;
        int val = 0;
        Node temp = null;
        Node head =null;

        while (firstNode!=null || secondNode!=null|| carry>0 ) {
            val=0;
            if (firstNode!=null) {
                val+=firstNode.data;
                firstNode=firstNode.next;
            }
            if (secondNode!=null) {
                val+= secondNode.data;
                secondNode= secondNode.next;                
            }
            val = val+carry;
            carry=val/10;
            val=val%10;
            Node newNode= new Node();
            newNode.data=val;
            newNode.next=null;

            if (temp==null) {
                temp = newNode;
                head=temp;
            }
            else
            {
            temp.next=newNode;
            temp=temp.next;
            }
        }
        ll retuning = new ll();
        retuning.Head=head;
        return retuning;
    }

    Node partition(ll newLl, int val)
    {
        Node temp = newLl.Head;
        Node toReturn = newLl.Head;
        while (temp!=null) {
            temp=temp.next;
            if (temp.data<val) {
                
            }
        }
        return toReturn;
    }




    }

}
