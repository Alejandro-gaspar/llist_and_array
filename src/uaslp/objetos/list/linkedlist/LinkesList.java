package uaslp.objetos.list.linkedlist;
public class LinkesList implements List {
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
      tail =node;
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
     Node aux = new Node();
     Node ant = new Node();
     int cont=1;
     aux = head;
     if (head != null) {
      while (aux != tail && cont != index) {
       ant=aux;
       aux = aux.next;
       cont++;
      }
      if (cont== index) {
       if (aux == head) {
        head = aux.next;
       } else {
        ant.next= aux.next;
        aux.next.previous = ant;
        aux.next = aux.previous = null;
        System.out.println("dato:" + aux.data + " removido");
       }
      }
     }
    }
    public void removeAll(){
head=tail=null;
     Runtime garbage = Runtime.getRuntime();
     garbage.gc();
    }
    public void setat(int index,String data){
     Node aux=new Node();
     aux=head;
     int cont = 1;
     if(head!=null) {
      while (aux != tail && cont!=index) {
       aux = aux.next;
       cont++;
      }
      if(cont==index){
       aux.data=data;
      }else System.out.println("index no valido");
     }else{
      addAtTails(data);
      System.out.println("dato insertado al final");
     }
    }
    public String getat(int index){
     String dat=null;
    if(head!=null){
     Node aux= new Node();
     aux=head;
     int cont = 1;
     while (aux != tail && cont!=index){
      aux=aux.next;
      cont++;
     }
     if(cont==index) {
      dat = aux.data;
      System.out.println("dato:"+dat+" encontrado");
     }
    }
     return dat;
    }
    public void removeallwithvalue(String data) {
     Node aux = new Node();
     Node ant = new Node();
     aux = head;
     if (head != null) {
      while (aux != tail && data.compareTo(aux.data) != 0) {
       ant = aux;
       aux = aux.next;
      }
      if (data.compareTo(aux.data) == 0) {
       System.out.println("dato:" + data + " encontrado");
       if (aux == head) {
        head = aux.next;
       } else {
        ant.next = aux.next;
        aux.next.previous = ant;
        aux.next = aux.previous = null;
        System.out.println("dato:" + aux.data + " removido");
       }
      }
     }
    }
    public int getSize(){
     return size;
    }
    public Iterator getIterador(){
     return new LinkedListIterador(head);
    }

}
