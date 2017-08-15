package org.trc.demo;

import org.trc.demo.Model.Node;
import org.trc.demo.Model.NodeData;

/**
 * Created by hzwyz on 2017/8/15 0015.
 */
public class DoubleLinkList {
    NodeData head;
    NodeData tail;
    int count;
    public DoubleLinkList(Node head,Node tail,int count){
        this.head=null;
        this.tail=null;
        this.count=0;
    }
    public DoubleLinkList(){

    }
    //尾插法添加节点
    public void addHeadNode(String data){
        NodeData node = new NodeData(data,null,null);
        if(head==null&&tail==null){
            head=node;
            head.setFront(null);
            tail=node;
            tail.setNext(null);
        }else{
            head.setFront(node);
            node.setNext(head);
            head=node;
            head.setFront(null);
        }
        count++;
    }
    //头插法添加节点
    public void addTailNode(String data){
        NodeData node = new NodeData(data,null,null);
        if(head==null&&tail==null){
            head=node;
            head.setFront(null);
            tail=node;
            tail.setNext(null);
        }else{
            tail.setNext(node);
            node.setFront(tail);
            tail=node;
            tail.setNext(null);
        }
        count++;

    }
    //查找节点
    public NodeData findNode(String data){
        NodeData temp=head;
        if(head!=null){
            while(temp!=null){
                if(temp.getData().equals(data)){
                    return temp;
                }
                temp=temp.getNext();
            }
        }
        return null;
    }
    //删除节点
    public void delNode(String data){
        NodeData temp=findNode(data);
        if(temp!=null){
            if(temp.getFront()==null){
                head=temp.getNext();
                head.setFront(null);
            }else if(temp.getNext()==null){
                tail=tail.getFront();
                tail.setNext(null);
            }else{
                temp.getFront().setNext(temp.getNext());
                temp.getNext().setFront(temp.getFront());
            }
            count--;
        }
    }
    //修改更新
    public void updNode(String data){
        NodeData temp=findNode(data);
        if(temp!=null){
            temp.setData(data);
        }
    }

}
