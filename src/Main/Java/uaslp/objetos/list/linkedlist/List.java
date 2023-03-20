package uaslp.objetos.list.linkedlist;
import uaslp.objetos.list.linkedlist.Node;
import uaslp.objetos.list.linkedlist.LinkedListIterador;
public interface List <T>{

     void addAtTails(T data);
     void addAtFront(T data);
     void remove(int index);
     void removeAll();
     void setat(int index,T data);
     T getat(int index);
     void removeallwithvalue(T data) ;
     int getSize();
     Iterator<T> getIterador();
    
}