package uaslp.objetos.array.arraylist;
import uaslp.objetos.exceptions.CollectionsException;
import uaslp.objetos.list.linkedlist.List;
public class Main {
    public static void main(String[] args) {
        try {
            List<String> arraylist = new ArrayList<>();
            arraylist.addAtFront("a");
        }catch (CollectionsException ex){

        }
    }
}
