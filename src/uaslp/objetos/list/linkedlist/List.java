package uaslp.objetos.list.linkedlist;
import uaslp.objetos.list.linkedlist.Node;
import uaslp.objetos.list.linkedlist.LinkedListIterador;
public interface List {

     void addAtTails(String data);
     void addAtFront(String data);
     void remove(int index);
     void removeAll();
     void setat(int index,String data);
     String getat(int index);
     void removeallwithvalue(String data) ;
     int getSize();
     Iterator getIterador();
    
}