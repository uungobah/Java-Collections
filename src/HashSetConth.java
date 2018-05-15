import java.util.HashSet;
import java.util.Iterator;

public class HashSetConth {
    public static void main(String[] args) {
        HashSet<String> myHash = new HashSet<String>();

        myHash.add("Sya");
        myHash.add("Aku");
        myHash.add("Aing");

        Iterator<String> it = myHash.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
