public class SiglyLinkedList
{
    class Node
    {
        int info;
        Node link;


        public Node (int data)
        {
            this.info = data;
            this.link = null;

        }
    }

    public Node first = null;
    public void InsertAtFirst(int data)
    {
        Node newNode = new Node(data);
        if (first == null)
        {
            first = newNode;
            return; 
        }
        Node temp = first;

        first = newNode;

        first.link = temp;
    }
    void display()
    {
        Node temp = first;
        while (temp != null) 
        {
            System.out.println(temp.info);
            temp = temp.link;
        }
    }
    void insertAtLast(int data) 
    {
        Node newNode = new Node(data);
        if (first == null) 
        {
            first = newNode;
        } else 
        {
            Node temp = first;
            while (temp.link!= null) 
            {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    void deleteLastNode() 
    {
        if (first == null) 
        {
            System.out.println("List is empty");
        } else if (first.link == null) 
        {
            first = null;
        } else 
        {
            Node temp = first;
            while (temp.link.link!= null) 
            {
                temp = temp.link;
            }
            temp.link = null;
        }
    }

    void deleteNodeAtPosition(int position) 
    {
        if (first == null) 
        {
            System.out.println("List is empty");
        } else 
        {
            Node temp = first;
            int count = 1;
            while (temp.link!= null && count < position - 1) 
            {
                temp = temp.link;
                count++;
            }
            if (count == position - 1) 
            {
                temp.link = temp.link.link;
            } else 
            {
                System.out.println("Position out of range");
            }
        }
    }
    public static void main(String[] args) 
    {
        SiglyLinkedList c = new SiglyLinkedList();
        c.InsertAtFirst(1);
        c.InsertAtFirst(2);
        c.insertAtLast(3);
        c.insertAtLast(4);
        c.deleteLastNode();
        c.deleteNodeAtPosition(2);

        c.display();
    }
}
