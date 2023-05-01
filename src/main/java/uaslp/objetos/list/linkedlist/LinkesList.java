package uaslp.objetos.list.linkedlist;
import java.io.IOException;

import uaslp.objetos.exceptions.BadIndexException;
import uaslp.objetos.exceptions.CollectionsException;
import uaslp.objetos.exceptions.NotNullAllowendException;

public class LinkesList<T> implements List<T> {
   private Node<T> head;
   private Node<T> tail;
    private int size;
    int index;
    public void addAtTails(T data)throws NotNullAllowendException {
     if (data==null){
      throw new NotNullAllowendException();
     }else {
      Node<T> node = new Node();
      node.data = data;
      node.previous = tail;
      if (head == null) {
       head = node;
       tail = node;
      } else {
       tail.next = node;
      }
      tail = node;
      size++;
     }
    }
    public void addAtFront(T data)throws NotNullAllowendException{
     if(data==null){
      throw new NotNullAllowendException();
     }else {
      Node<T> node = new Node();
      node.data = data;
      node.previous = null;
      if (head == null) {
       head = node;
       tail = node;
      } else {
       node.next = head;
       head = node;
      }
     }
    }
    public void remove(int index) throws BadIndexException {
     if(index<0||index>size){
      throw new BadIndexException();
     }
     Node<T> aux;
     Node<T> ant;
     int cont=1;
     aux = head;
     ant=head;
     if (head != null) {
      while (aux.next != tail && cont != index) {
       ant=aux;
       aux = aux.next;
       cont++;
      }
      if (cont== index) {
       if (aux == head) {
        head = aux.next;
       } else {
        if(aux.next==null){
         ant.next=null;
        }else {
         ant.next= aux.next;
         aux.next.previous = ant;
         aux.next = aux.previous = null;
        }
       }
      }
     }
    }
    public void removeAll(){
head=tail=null;
     Runtime garbage = Runtime.getRuntime();
     garbage.gc();
    }
    public void setAt(int index,T data)throws BadIndexException,NotNullAllowendException {
     if (data == null) {
      throw new NotNullAllowendException();
     } else {if(index<0||index>size){
      throw new BadIndexException();
     }
      Node<T> aux = new Node();
      aux = head;
      int cont = 1;
      if (head != null) {
       while (aux != tail && cont != index) {
        aux = aux.next;
        cont++;
       }
       if (cont == index) {
        aux.data = data;
       }
       addAtTails(data);
      }
     }
    }
    public T getat(int index)throws BadIndexException{
     if(index<0||index>size){
      throw new BadIndexException();
     }
     T dat=null;
    if(head!=null){
     Node<T> aux= new Node();
     aux=head;
     int cont = 1;
     while (aux != tail && cont!=index){
      aux=aux.next;
      cont++;
     }
     if(cont==index) {
      dat = aux.data;
     }
    }
     return dat;
    }
    public void removeallwithvalue(T data) {
     Node<T> aux = new Node();
     Node<T> ant = new Node();
     aux = head;
     if (head != null) {
      while (aux != tail && data==aux.data) {
       ant = aux;
       aux = aux.next;
      }
      if (data==aux.data) {
       System.out.println("dato:" + data + " encontrado");
       if (aux == head) {
        head = aux.next;
       } else {
        ant.next = aux.next;
        aux.next.previous = ant;
        aux.next = aux.previous = null;
        System.out.println("dato:" + aux.data + " removido");
       }
      }
     }
    }
    public int getSize(){
     return size;
    }
    public Iterator<T> getIterador(){
     return new LinkedListIterador<>(head);
    }

}
