package kr.hs.dgsw.java.list;

public class MyList implements MyListInterface{

    private Node head;
    private int size = 0;

    @Override
    public void add(String value) {
        Node node = new Node();
        node.setValue(value);

        Node listNode = getLastNode();
        if (listNode == null) {
            head = node;
        } else {
            listNode.setNext(node);
        }
        size++;
    }

    private Node getLastNode() {
        Node node = head;

        if (node == null) return null;

        for (int i = 0; i < size; i++) {
            if (node == null) throw new IndexOutOfBoundsException();
            node = node.getNext();
        }
        return node;
    }

    @Override
    public String get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            if (node == null) throw new IndexOutOfBoundsException();
            node = node.getNext();
        }
        return node.getValue();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void remove(int index) {
        Node node = head;

        if (node == null) return;

        for (int i = 0; i < index; i++) {
            if (node == null) throw new IndexOutOfBoundsException();
            node = node.getNext();
        }
        node.setNext(null);
    }
}
