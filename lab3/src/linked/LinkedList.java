package linked;

public class LinkedList {
    Node head;
    Node last;

    public LinkedList(){
        head = null;
        last = null;
    }

    @Override
    public String toString(){
        if (head == null)
            return "The list is empty";
        Node aux = head;
        while (aux != null){
            System.out.println(aux.value);
            aux = aux.next;
        }
        return "End of the list";
    }

    public void add(int x){
        if (head == null) {
            head = new Node(x);
            last = head;
        }
        else if (head == last){
            head.next = new Node(x);
            last = head.next;
        }
        else
            last.next = new Node(x);
    }

    public void remove(){
        head = head.next;
        if (head == null)
            last = null;
    }

    private class Node{
        int value;
        Node next;

        Node(int x){
            value = x;
            next = null;
        }
    }
}