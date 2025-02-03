package gr.aueb.cf.ch19;

public class NodeGen <T> {
    private T item;

    public T getItem() {
        return item;
    }

    public NodeGen () {

    }

    public void setItem(T item) {
        this.item = item;
    }
}
