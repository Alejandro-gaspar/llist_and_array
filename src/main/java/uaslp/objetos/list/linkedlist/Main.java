package uaslp.objetos.list.linkedlist;

import uaslp.objetos.array.arraylist.ArrayList;
import uaslp.objetos.exceptions.CollectionsException;
import uaslp.objetos.exceptions.BadIndexException;
import uaslp.objetos.exceptions.NotNullAllowendException;

public class Main {
    public static void main(String[]args) {
        try {
            List<String> linkesList = new LinkesList<>();
            //System.out.println(linkesList.getSize());
            linkesList.addAtFront("a");
            linkesList.addAtFront("b");
            linkesList.addAtFront("c");
            linkesList.getIterador();
            linkesList.getat(2);
            linkesList.removeallwithvalue("b");
            linkesList.remove(2);
            linkesList.getIterador();
            linkesList.addAtFront("d");
            linkesList.addAtFront("e");
            linkesList.setAt(2, "t");
            linkesList.getIterador();
        }catch (CollectionsException ex){

        }
    }
}
