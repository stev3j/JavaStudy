package kr.hs.dgsw.java.list;

import java.security.PublicKey;

public class Node {

    private String value;

    private Node next;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }
}
