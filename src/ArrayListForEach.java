import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<String>();

        myArray.add("Budi");
        myArray.add("Ani");
        myArray.add("Suci");
        myArray.add("Roni");

        for (String obj : myArray){
            System.out.println(obj);
        }
    }

}
