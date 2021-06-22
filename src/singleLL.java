public class singleLL {

    class Node {

        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void getNUmber() {
        Node current = head;
        int num=0;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");

        while (current != null) {
            num=num*10 + current.data;
            current = current.next;
        }
        System.out.println();
        System.out.println(num);
    }

    public static void main(String[] args) {

        singleLL sList = new singleLL();

        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        //Displays the nodes present in the list
        sList.getNUmber();
    }
}