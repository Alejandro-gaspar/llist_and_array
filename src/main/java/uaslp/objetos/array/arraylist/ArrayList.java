package uaslp.objetos.array.arraylist;
import uaslp.objetos.exceptions.BadIndexException;
import uaslp.objetos.exceptions.CollectionsException;
import uaslp.objetos.exceptions.NotNullAllowendException;
import uaslp.objetos.list.linkedlist.Iterator;
import uaslp.objetos.list.linkedlist.List;

public class ArrayList<T> implements List<T> {
    private static  final int Valor_ini =2;
     T[] array;
    private int size=0;
    public ArrayList(){
        array=(T[])(new Object[Valor_ini]);
    }
    public void addAtTails(T data) throws  NotNullAllowendException{
        if (size == array.length){
            increaseSize();
        }
        if(data==null){
            throw new NotNullAllowendException();
        }
        array[size]=data;
        size++;
    }
    public void addAtFront(T data) throws NotNullAllowendException {
      int i=0;
      if(data==null){
          throw new NotNullAllowendException();
      }
      if(array.length==size) {
          array[0]=data;
      }
      size++;
    }
    public void remove(int index) throws BadIndexException {
        if(index <0||index>size){
            throw new BadIndexException();
        }
        if(index != size-1) {
            for (int i = 1; i < size-1; i++) {
                array[index] = array[index + i];
                index++;
            }
        }
      size--;
    }
    public void removeAll(){
size=0;
    }
    public void setAt(int index,T data) throws BadIndexException,NotNullAllowendException{
       if(data==null){
           throw new NotNullAllowendException();
       }
        if(index <0||index>size){
            throw new BadIndexException();
       }else{
        array[index]=data;
       }
    }
    public T getat(int index)throws BadIndexException{
        if(index <0||index>size){
            throw new BadIndexException();
        }
            return array[index];
    }
    public int getSize(){return size;}
    private void increaseSize(){
        T[] newarray =(T[])(new Object[array.length * 2]);
        for(int i=0;i< array.length;i++)
        {
            newarray[i]=array[i];
        }
        array=newarray;
    }
    public Iterator<T> getIterador(){
        return new ArrayListIterador<T>(this);
    }
    public void removeallwithvalue(T data) {
for(int currentIndex=size-1;currentIndex>=0;currentIndex--){
    if(array[currentIndex].equals(data)){
        try {
            remove(currentIndex);
        }catch (BadIndexException ignored){

        }
    }
}
    }

}