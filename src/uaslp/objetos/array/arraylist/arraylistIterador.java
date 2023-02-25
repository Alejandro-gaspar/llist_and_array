package uaslp.objetos.array.arraylist;
public class arraylistIterador {
public String []data;

arraylistIterador(String []array){

    data=new String[array.length];
    data[0]=array[0];
}
    public void next(){
    for(int i=0;i<data.length && data[i]!=null ;i++) {
        String dat = data[i];
    }
    }
}
