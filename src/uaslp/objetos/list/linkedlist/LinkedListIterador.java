package uaslp.objetos.list.linkedlist;

public class LinkedListIterador {
    private Node currentNode;
    LinkedListIterador(Node head){
        currentNode=head;
    }
    public boolean hasnext(){
     return currentNode != null;
    }
    public String next(){
       String data=currentNode.data;
       currentNode=currentNode.next;
       return data;
    }

}
