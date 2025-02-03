package gr.aueb.cf.ch19.doubly_linked_list;

public class DoublyLinkedList <T> {
    private Node <T>  head ;
    private Node <T> tail;

    public DoublyLinkedList () {

    }


    /**
     * Time Complexity 0(1)
     * @param t the value to be inserted
     */
    public void insertFirst(T t) {
        Node <T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        if (head == null) tail = tmp;
        else head.setPrev(tmp);
        head = tmp;
    }


    /**
     * Time-Complexity 0(1)
     * @param t
     */
    public void insertLast (T t) {
        if (head == null) {
            insertFirst(t);
            return;
        }

        Node <T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail.setNext(tmp);
        tail=tmp;

    }
}
