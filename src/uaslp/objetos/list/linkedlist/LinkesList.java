package uaslp.objetos.list.linkedlist;
public class LinkesList {
   private Node head;
   private Node tail;
    private int size;
    int index;
    public void addAtTails(String data){
     Node node=new Node();
     node.data=data;
     node.previous=tail;
     if (head == null) {
      head=node;
      tail=node;
     }else{
      tail.next=node;
     }
     tail=node;
     size++;
    }
    public void addAtFront(String data){
     Node node=new Node();
     node.data=data;
     node.previous=null;
     if(head==null){
      head=node;
      tail=node;
     }else {
      node.next=head;
      head=node;
     }
    }
    public void remove(int index) {
     Node aux=head;
     int cont = 1;
     do {
      aux=aux.next;
      cont++;
     } while (aux != tail && cont!=index);
     if(cont==index){
      aux.previous.next=aux.next;
      aux.next.previous=aux.previous;
      aux.next=aux.previous=null;
      Runtime garbage = Runtime.getRuntime();
      garbage.gc();
     }else{
      System.out.println("index no valido");
     }
    }
    public void removeAll(){
head=tail=null;
     Runtime garbage = Runtime.getRuntime();
     garbage.gc();
    }
    public void setat(int index,String data){
     Node aux=head;
     int cont = 1;
     do {
      aux=aux.next;
      cont++;
     } while (aux != tail && cont!=index);
     if(cont==index){
      aux.data=data;
     }else{
      System.out.println("index no valido");
      addAtTails(data);
      System.out.println("dato insertado al final");
     }
    }
    public String getat(int index){
     Node aux=head;
     String dat=null;
     int cont = 1;
     do {
      aux=aux.next;
      cont++;
     } while (aux != tail && cont!=index);
     if(cont==index) dat = aux.data;

     return dat;
    }
    public void removeallwithvalue(String data){
     Node aux=head;
     do {
      aux=aux.next;
     } while (aux != tail && data.compareTo(aux.data)!=0);
     if(data.compareTo(aux.data)==0){
      System.out.println("dato:"+data+" encontrado");
      if(aux==head) {
       head=aux.next;
      }else{
       aux.previous.next=aux.next;
       aux.next.previous=aux.previous;
       aux.next=aux.previous=null;
       Runtime garbage = Runtime.getRuntime();
       garbage.gc();
      }
      System.out.println("dato:"+data+" removido");
     }
    }
    public int getSize(){
     return size;
    }
    public LinkedListIterador getIterador(){

     return new LinkedListIterador(head);
    }

}
