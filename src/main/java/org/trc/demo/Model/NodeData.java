package org.trc.demo.Model;

/**
 * Created by hzwyz on 2017/8/15 0015.
 */
public class NodeData {
    private String data;//数据区

    private NodeData front;//指针区

    private NodeData next;

    public NodeData() {
    }

    public NodeData(String data, NodeData front, NodeData next) {
        this.data = data;
        this.front = front;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NodeData getFront() {
        return front;
    }

    public void setFront(NodeData front) {
        this.front = front;
    }

    public NodeData getNext() {
        return next;
    }

    public void setNext(NodeData next) {
        this.next = next;
    }
}
