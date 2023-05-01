package uaslp.objetos.list.linkedlist;
import uaslp.objetos.exceptions.CollectionsException;
import uaslp.objetos.list.linkedlist.Node;
import uaslp.objetos.list.linkedlist.LinkedListIterador;

import uaslp.objetos.exceptions.BadIndexException;
import uaslp.objetos.exceptions.NotNullAllowendException;

public interface List <T>{

     void addAtTails(T data) throws NotNullAllowendException;
     void addAtFront(T data) throws NotNullAllowendException;
     void remove(int index) throws BadIndexException;
     void removeAll();
     void setAt(int index,T data)throws BadIndexException,NotNullAllowendException;
     T getat(int index) throws BadIndexException;
     void removeallwithvalue(T data) ;
     int getSize();
     Iterator<T> getIterador();
    
}