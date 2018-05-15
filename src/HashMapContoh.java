import java.util.HashMap;
import java.util.Map;

public class HashMapContoh {

    public static void main(String[] args) {
        HashMap<Integer,String> myMap = new HashMap<Integer, String>();

        myMap.put(1,"Aku");
        myMap.put(2,"Saya");
        myMap.put(3,"Aing");

        System.out.println("Cara 1");
        System.out.println("=========================================");
        for (Map.Entry en : myMap.entrySet()){
            System.out.println(en.getKey() + " - " + en.getValue());
        }

        System.out.println("=========================================");
        System.out.println("Cara 2");
        System.out.println("=========================================");
        for (Integer key: myMap.keySet()){
            System.out.println(key +" - "+myMap.get(key));
        }
    }
}
