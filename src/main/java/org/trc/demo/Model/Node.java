package org.trc.demo.Model;

/**
 * Created by hzwyz on 2017/8/15 0015.
 */
public class Node {
    private String data;//数据区

    private Node next;//指针区

    public Node() {
    }

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
