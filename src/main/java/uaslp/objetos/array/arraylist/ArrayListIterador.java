package uaslp.objetos.array.arraylist;

import uaslp.objetos.exceptions.BadIndexException;
import uaslp.objetos.exceptions.CollectionsException;
import uaslp.objetos.list.linkedlist.Iterator;

public class ArrayListIterador<T> implements Iterator<T> {
public int currentindex;
private final ArrayList<T> list;
ArrayListIterador(ArrayList<T> list){
    this.list=list;
    currentindex=0;
    }
    ArrayListIterador(ArrayList<T>list,int index) {
        this.list=list;
        currentindex=index;
    }
    public boolean hasnext() {
        return currentindex<list.getSize();
    }
    public T next() {
        T data =null;
    try {
        data = list.getat(currentindex);
    }catch (BadIndexException ignored){
    }
        currentindex++;
        return data;
}
public boolean hasPrevious(){
    return currentindex>=0;
}
public T previous(){
    T data=null;
    try{
        data=list.getat(currentindex);
    }catch (BadIndexException ignored){
    }
    currentindex--;
    return data;
}



}
