import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UC8FilterBogiesStream {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Filter bogies with capacity > 60
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("Filtered Bogies (capacity > 60):");
        for (Bogie b : filtered) {
            System.out.println(b);
        }

        // Show original list unchanged
        System.out.println("Original Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}