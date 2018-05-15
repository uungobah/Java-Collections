import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListContoh {

    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<String>();

        myArray.add("Budi");
        myArray.add("Ani");
        myArray.add("Suci");
        myArray.add("Roni");

        Iterator itr = myArray.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
