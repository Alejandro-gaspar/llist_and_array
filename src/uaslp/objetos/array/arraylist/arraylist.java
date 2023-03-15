package uaslp.objetos.array.arraylist;

import uaslp.objetos.list.linkedlist.List;

public class arraylist<T> implements List<T> {
    private static  final int Valor_ini =2;
    private Object[]array;
    private int size;
    public arraylist(){
       Object array=new Object[Valor_ini];
    }
    public void addAtTails(T data) {
        if (size == array.length){
            increaseSize();
        }
        array[size]=data;
        size++;
    }
    public void addAtFront(T data){
      int i,j;
      for(i=size;i>0;i--){
          array[i]=array[i-1];
      }
      array[0]=data;
      size++;
    }
    public void remove(int index){
        if(index != size-1){
            for(int i=1;i<size;i++){
                array[index]=array[index+i];
                index++;
            }
        }
      size--;
    }
    public void removeAll(){
size=0;
    }
    public void setat(int index,T data){
        if(index> array.length){
            System.out.println("index no valido");
       }else{
        array[index]=data;
       }
    }
    public T getat(int index){
        T data =(T)array[index];
        return data;
    }
    public int getSize(){return size;}
    private void increaseSize(){
        Object []newarray=new Object[array.length*2];
        for(int i=0;i< array.length;i++)
        {
            newarray[i]=array[i];
        }
        array=newarray;
    }
    public arraylistIterador<T> getIterador(){
        return new arraylistIterador<>(this);
    }
    public void removeallwithvalue(T data) {

    }

}