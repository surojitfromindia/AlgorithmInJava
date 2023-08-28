package org.surojit.DataStructure;

public class LinkedList {
    Node startNode;
    Node lastNode;

    public LinkedList(int initialValue){
        startNode = new Node(initialValue,null);
        lastNode = startNode;
    }

    public void display(){
        Node node = startNode;
        while (node!=null){
            System.out.println(node.value);
            node= node.nextNode;
        }
    }

    public void addNodeAtEnd(int number){
        // add after last node
        Node newNode = new Node(number,null);
        lastNode.nextNode = newNode;
        lastNode = newNode;
    }
    public void addNodeAtFront(int number){
        startNode = new Node(number,startNode);
    }

    public void delete(){
        // while holding the current node check if its next node
        // points to nodes
        Node head = startNode;
        while (head.nextNode.nextNode!=null){
            // this will go until it reaches the element just before the end element
            head = head.nextNode;
        }
        head.nextNode=null;
    }
}

class Node{
    int value;
    Node nextNode;
    public Node(int value, Node nextNode){
        this.value = value;
        this.nextNode = nextNode;
    }

}