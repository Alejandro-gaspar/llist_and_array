package uaslp.objetos.array.arraylist;

import uaslp.objetos.list.linkedlist.Iterator;

public class arraylistIterador<T> implements Iterator<T> {
public int currentindex;
private final arraylist<T> list;

arraylistIterador(arraylist<T> list){
    this.list=list;
    currentindex=0;
}
arraylistIterador(arraylist<T> list,int index) {
    this.list = list;
    currentindex = index;
}

    @Override
    public boolean hasnext() {
        return currentindex <list.getSize();
    }

    public T next(){
    T data=list.getat(currentindex);
    currentindex++;
    return data;
    }
}
