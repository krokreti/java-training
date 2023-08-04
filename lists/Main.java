import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// diferença entre arrayList e String[] é q arrayList pode-se aumentar o número de elementos dinamicamente.
// Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
public class Main {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3};
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.size());
        for (String i : cars) {
            System.out.println(i);
        }
        Collections.sort(cars);
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(0, "Fiat");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        OtherLists hash = new OtherLists();
        System.out.println(hash.capitalCities);
        hash.capitalCities.remove("Germany");
        System.out.println(hash.capitalCities.get("England"));
        for (String i : hash.capitalCities.keySet()) {
            System.out.println(i);
        }
        for (String i : hash.capitalCities.values()) {
            System.out.println(i);
        }

        ListsHashSet hashSet = new ListsHashSet();
        System.out.println(hashSet.cars);
        System.out.println(hashSet.cars.contains("Mazda"));
        Double myDouble = 5.99;
        System.out.println(myDouble.toString());

        try {
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Try ... Catch is finished");
        }
    }
}
