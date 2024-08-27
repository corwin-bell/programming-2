import java.util.ArrayList;
import java.util.HashSet;

public class ListSetExample {
    public static void main(String[] args) throws Exception {
        // Create list for gym checkin instances
        ArrayList<String> gymCheckins = new ArrayList<>();
        
        // add checkins to list
        // Joe and Mary checkin multiple times
        gymCheckins.add("Joe");
        gymCheckins.add("Frank");
        gymCheckins.add("Mary");
        gymCheckins.add("Joe");
        gymCheckins.add("Mary");
        
        System.out.println(gymCheckins);
        // returns [Joe, Frank, Mary, Joe, Mary]

        // Create set to isolate unique gym checkins
        HashSet<String> uniqueGymCheckins = new HashSet<>();
        uniqueGymCheckins.addAll(gymCheckins);

        System.out.println(uniqueGymCheckins);
        // returns [Joe, Frank, Mary]
    }
}
