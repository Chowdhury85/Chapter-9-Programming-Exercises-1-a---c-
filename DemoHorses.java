import java.util.Scanner;

public class DemoHorses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create a regular Horse object
        Horse horse1 = new Horse();
        System.out.println("Enter details for a regular horse:");
        System.out.print("Name: ");
        horse1.setName(input.nextLine());
        System.out.print("Color: ");
        horse1.setColor(input.nextLine());
        System.out.print("Birth Year: ");
        horse1.setBirthYear(input.nextInt());
        input.nextLine(); // Consume the newline
        
        // Create a RaceHorse object
        RaceHorse raceHorse1 = new RaceHorse();
        System.out.println("\nEnter details for a race horse:");
        System.out.print("Name: ");
        raceHorse1.setName(input.nextLine());
        System.out.print("Color: ");
        raceHorse1.setColor(input.nextLine());
        System.out.print("Birth Year: ");
        raceHorse1.setBirthYear(input.nextInt());
        System.out.print("Number of races competed: ");
        raceHorse1.setRacesCompeted(input.nextInt());
        
        // Display the information
        System.out.println("\nRegular Horse Details:");
        System.out.println("Name: " + horse1.getName());
        System.out.println("Color: " + horse1.getColor());
        System.out.println("Birth Year: " + horse1.getBirthYear());
        
        System.out.println("\nRace Horse Details:");
        System.out.println("Name: " + raceHorse1.getName());
        System.out.println("Color: " + raceHorse1.getColor());
        System.out.println("Birth Year: " + raceHorse1.getBirthYear());
        System.out.println("Races Competed: " + raceHorse1.getRacesCompeted());
        
        input.close();
    }
}
