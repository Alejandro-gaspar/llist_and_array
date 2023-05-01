package Test;
import uaslp.objetos.list.linkedlist.Iterator;
import uaslp.objetos.list.linkedlist.List;
import uaslp.objetos.array.arraylist.ArrayList;
import uaslp.objetos.exceptions.BadIndexException;
import uaslp.objetos.exceptions.CollectionsException;
import uaslp.objetos.exceptions.NotNullAllowendException;
import uaslp.objetos.list.linkedlist.LinkesList;

public class Main {

    public static void main(String[] args) {

        List<Object> list1 = new LinkesList<>();
        List<Object> list2 = new ArrayList<>();

        try {

            System.out.println("\nTest list1 (LinkedList)");
            testAddAtFront(list1);
            testAddAtTail(list1);
            testRemoveNthElement(list1);
            testSetAtIndex(list1);
            testGetAtIndex(list1);
            testRemoveAllWithValue(list1);

            System.out.println("\nTest list2 (ArrayList)");
            testAddAtFront(list2);
            testAddAtTail(list2);
            testRemoveNthElement(list2);
            testSetAtIndex(list2);
            testGetAtIndex(list2);
            testRemoveAllWithValue(list2);

        } catch (CollectionsException ex) {
            ex.printStackTrace();
        }
    }

    private static void testRemoveAllWithValue(List<Object> list) throws NotNullAllowendException{
        System.out.println("\n-> Test remove all with value.");
        list.addAtTails("A");
        list.addAtTails(1);
        list.addAtTails(1);
        list.addAtTails("A");
        list.addAtTails(1);
        list.addAtTails("A");
        printList(list);
        System.out.println("Size: " + list.getSize() + " Capacity: ");
        list.removeallwithvalue("A");
        printList(list);
        System.out.println("Size: " + list.getSize());
        list.removeallwithvalue(1);
        printList(list);
        System.out.println("Size: " + list.getSize());
    }

    private static void testGetAtIndex(List<Object> list) throws CollectionsException {
        System.out.println("\n-> Test get at index.");
        list.addAtTails("0");
        list.addAtTails(1);
        list.addAtTails('2');
        printList(list);
        System.out.println(list.getat(0));
        System.out.println(list.getat(1));
        System.out.println(list.getat(2));
        System.out.println(list.getat(3));
        list.removeAll();
    }

    private static void testSetAtIndex(List<Object> list) throws CollectionsException {
        System.out.println("\n-> Test set at index.");
        list.addAtTails("A");
        list.addAtTails(2);
        list.addAtTails(3);
        list.addAtTails("D");
        printList(list);
        list.setAt(0, "X");
        list.setAt(1, 10);
        list.setAt(3, "Z");
        list.setAt(4, "ERROR");
        printList(list);
        list.removeAll();
    }

    private static void testRemoveNthElement(List<Object> list) throws CollectionsException{
        System.out.println("\n-> Test remove nth-element.");
        list.addAtTails("A");
        list.addAtTails(2);
        list.addAtTails("C");
        list.addAtTails(4);
        printList(list);
        System.out.println("Size: " + list.getSize());
        list.remove(4);
        list.remove(3);
        list.remove(1);
        list.remove(0);
        printList(list);
        System.out.println("Size: " + list.getSize());
        list.remove(0);
        printList(list);
        System.out.println("Size: " + list.getSize());
        list.remove(0);
    }

    private static void testAddAtTail(List<Object> list) throws NotNullAllowendException {
        System.out.println("\n-> Test add at Tail.");
        list.addAtTails("A");
        list.addAtTails('C');
        list.addAtTails(3);
        printList(list);
        System.out.println("Size: " + list.getSize());
        list.removeAll();
    }

    private static void testAddAtFront(List<Object> list) throws NotNullAllowendException {
        System.out.println("\n-> Test add at Front.");
        list.addAtFront("A");
        list.addAtFront(2);
        list.addAtFront('C');
        printList(list);
        System.out.println("Size: " + list.getSize());
        list.removeAll();
    }

    public static void printList(List<Object> list) {
        Iterator<Object> it = list.getIterador();
        System.out.print("List contents: ");
        while (it.hasnext()) {
            System.out.print(it.next() + " ");
        }
        System.out.print("\n");
    }
}
