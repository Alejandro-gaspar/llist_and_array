package uaslp.objetos.list.linkedlist;

public class Main {
    public static void main(String[]args) {
        List linkesList = new LinkesList();
        //System.out.println(linkesList.getSize());
       linkesList.addAtFront("a");
        linkesList.addAtFront("b");
        linkesList.addAtFront("c");
        linkesList.getIterador();
        linkesList.getat(2);
        linkesList.removeallwithvalue("b");
      // linkesList.remove(2);
       // linkesList.getIterador();
        linkesList.addAtFront("d");
        linkesList.addAtFront("e");
        linkesList.setat(2,"t");
        linkesList.getIterador();
    }
}
