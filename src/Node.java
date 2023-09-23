public class Node<T> {
    private Node<T> next;
    private Node<T> prev;
    private T value;

    public Node(Node<T> next, Node<T> prev, T value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
