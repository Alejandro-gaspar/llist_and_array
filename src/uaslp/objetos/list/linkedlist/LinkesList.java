package uaslp.objetos.list.linkedlist;
public class LinkesList<T> implements List<T> {
   private Node<T> head;
   private Node<T> tail;
    private int size;
    int index;
    public void addAtTails(T data){
     Node<T> node=new Node();
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
    public void addAtFront(T data){
     Node<T> node=new Node();
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
     Node<T> aux = new Node();
     Node<T> ant = new Node();
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
    public void setat(int index,T data){
     Node<T> aux=new Node();
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
    public T getat(int index){
     T dat=null;
    if(head!=null){
     Node<T> aux= new Node();
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
    public void removeallwithvalue(T data) {
     Node<T> aux = new Node();
     Node<T> ant = new Node();
     aux = head;
     if (head != null) {
      while (aux != tail && data==aux.data) {
       ant = aux;
       aux = aux.next;
      }
      if (data==aux.data) {
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
    public Iterator<T> getIterador(){
     return new LinkedListIterador<>(head);
    }

}
