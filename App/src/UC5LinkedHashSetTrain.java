import java.util.LinkedHashSet;
import java.util.Set;

public class UC5LinkedHashSetTrain {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt to add duplicate
        train.add("Sleeper"); // duplicate (will be ignored)

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(train);
    }
}