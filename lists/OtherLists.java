import java.util.HashMap;

//Hashmap store items in key/value pairs, and you can access them by an index of another type
public class OtherLists {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    HashMap<String, Integer> people = new HashMap<String, Integer>();

    public OtherLists() {
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        people.put("John", 30);
        people.put("Steve", 32);
        people.put("Angie", 33);
    }

}
