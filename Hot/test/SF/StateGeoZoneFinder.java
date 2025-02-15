package SF;

import java.util.Scanner;

public class StateGeoZoneFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeoPoliticalZoneService service = new GeoPoliticalZoneService();
        do {
            System.out.print("Enter a Nigerian state: ");
            String state = scanner.nextLine().trim();

            String result = service.findGeoPoliticalZone(state);
            System.out.println("The state " + state + " belongs to: " + result);

        } while (true);
    }
}
