import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListContoh {
    public static void main(String[] args) {
        LinkedList<String> myLinked = new LinkedList<String>();

        myLinked.add("Abi");
        myLinked.add("Abu");
        myLinked.add("Bakar");

        Iterator it = myLinked.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
