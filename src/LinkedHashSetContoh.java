import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetContoh {
    public static void main(String[] args) {
        LinkedHashSet<String> myHash = new LinkedHashSet<>();

        myHash.add("Sya");
        myHash.add("Aku");
        myHash.add("Aing");

        Iterator<String> it = myHash.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
