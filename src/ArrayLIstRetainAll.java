import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIstRetainAll {

    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("Ahmad");
        arr1.add("Sandy");
        arr1.add("Dinan");

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("Dennis");
        arr2.add("Ia");
        arr2.add("Irwan");

        arr1.retainAll(arr2);

        Iterator itr= arr1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
