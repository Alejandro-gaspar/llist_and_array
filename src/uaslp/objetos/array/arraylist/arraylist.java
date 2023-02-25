package uaslp.objetos.array.arraylist;

public class arraylist {
    private static  final int Valor_ini =2;
    private String []array;
    private int size;
    public arraylist(){
        array=new String[Valor_ini];
    }
    public void addAtTails(String data) {
        if (size == array.length){
            increaseSize();
        }
        array[size]=data;
        size++;
    }
    public void addAtFront(String data){
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
    public void setat(int index,String data){
        if(index> array.length){
            System.out.println("index no valido");
       }else{
        array[index]=data;
       }
    }
    public String getat(int index){
        String data =array[index];
        return data;
    }
    public int getSize(){return size;}
    private void increaseSize(){
        String []newarray=new String[array.length*2];
        for(int i=0;i< array.length;i++)
        {
            newarray[i]=array[i];
        }
        array=newarray;
    }
    public arraylistIterador getIterador(){
        return new arraylistIterador(array);
    }

}