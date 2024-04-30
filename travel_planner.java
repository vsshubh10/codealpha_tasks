import java.util.Scanner;

public class TravelPlanner {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Travel Itinerary Planner!");
        System.out.print("Enter number of destinations: ");
        int numDestinations = scanner.nextInt();
        scanner.nextLine();
        
        String[] destinations = new String[numDestinations];
        for (int i = 0; i < numDestinations; i++) {
            System.out.print("Enter destination " + (i + 1) + ": ");
            destinations[i] = scanner.nextLine();
        }
        
        System.out.print("Enter start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        System.out.print("Enter end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();
        
        System.out.print("Enter your budget: $");
        double budget = scanner.nextDouble();
        
        generateItinerary(destinations, startDate, endDate, budget);
        
        scanner.close();
    }
    
    public static void generateItinerary(String[] destinations, String startDate, String endDate, double budget) {
        System.out.println("\n*** Your Travel Itinerary ***");
        System.out.println("Dates: " + startDate + " to " + endDate);
        System.out.println("Budget: $" + budget);
        System.out.println("Destinations:");
        for (int i = 0; i < destinations.length; i++) {
            System.out.println((i + 1) + ". " + destinations[i]);
        }
        System.out.println("\n*** Detailed Itinerary ***");
    }
}
