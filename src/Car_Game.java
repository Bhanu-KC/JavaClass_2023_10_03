import java.util.Scanner;

public class Car_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Car Game!");
        System.out.println("Type 'hint' for instructions or 'quit' to exit.");

        boolean carStarted = false;

        while (true) {
            System.out.print("Enter a command: ");
            command = scanner.nextLine().toLowerCase();

            if (command.equals("quit")) {
                break;
            } else if (command.equals("hint")) {
                System.out.println("Type 'start' to start the car.");
                System.out.println("Type 'stop' to stop the car.");
                System.out.println("Type 'quit' to quit the game.");
            } else if (command.equals("start")) {
                if (carStarted) {
                    System.out.println("The car is already started.");
                } else {
                    carStarted = true;
                    System.out.println("The car is now started.");
                }
            } else if (command.equals("stop")) {
                if (carStarted) {
                    carStarted = false;
                    System.out.println("The car is now stopped.");
                } else {
                    System.out.println("The car is already stopped.");
                }
            } else {
                System.out.println("Invalid command. Type 'hint' for instructions.");
            }
        }

        System.out.println("Thanks for playing the Car Game!");
    }
}
