public class Linklist {
    private Node head;
    private static int Size = 0;

    public Linklist(){
        this.head = null;
    }

    public void Insert(Vaccine data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        this.Size++;
    }

    public void delete(Vaccine data) {
        if (isEmpty()) return;

        if (head.data == data) {
            head = head.next;
            this.Size--;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            this.Size--;
        }
    }

    public boolean isEmpty(){
       return head == null ;
    }

    public int getSize() {
        return Size;
    }

    public void Deleteall(){
        if (isEmpty()) return;
        Node temp = head;
        Node temp2 = head;
        while (temp.next != null) {
            temp = temp.next;
            temp2.next = null;
            temp2 = temp ;
        }
        head = null;
    }

    public void traversal() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.toString() + " -> ");
            System.out.println();
            temp = temp.next;
        }
        System.out.println("null");
    }

}