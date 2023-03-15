package uaslp.objetos.list.linkedlist;

public class LinkedListIterador<T> implements Iterator <T> {
    private Node<T> currentNode;
    LinkedListIterador(Node<T> head){
        currentNode=head;
    }
    public boolean hasnext(){
     return currentNode != null;
    }
    public T next(){
       T data=currentNode.data;
       currentNode=currentNode.next;
        System.out.println("dato:"+data);
       return data;
    }

}
