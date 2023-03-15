package uaslp.objetos.array.arraylist;

import uaslp.objetos.list.linkedlist.Iterator;

public class arraylistIterador implements Iterator {
public int currentindex;
private final arraylist list;

arraylistIterador(arraylist list){
    this.list=list;
    currentindex=0;
}
arraylistIterador(arraylist list,int index) {
    this.list = list;
    currentindex = index;
}

    @Override
    public boolean hasnext() {
        return currentindex <list.getSize();
    }

    public String next(){
    String data=list.getat(currentindex);
    currentindex++;
    return data;
    }
}
