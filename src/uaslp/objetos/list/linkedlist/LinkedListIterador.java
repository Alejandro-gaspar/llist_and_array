package uaslp.objetos.list.linkedlist;

public class LinkedListIterador implements Iterator{
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
        System.out.println("dato:"+data);
       return data;
    }

}
