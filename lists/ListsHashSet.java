import java.util.HashSet;

//HashSet is a collection of items where every item is unique
public class ListsHashSet {
    HashSet<String> cars = new HashSet<String>();

    public ListsHashSet() {
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        // In the example above, even though BMW is added twice it only appears once in the set because every item in a set has to be unique.
    }
}
