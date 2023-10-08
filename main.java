import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Say Hello");
            System.out.println("2. Show Developer's Name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-2): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Hello, World!");
                    break;
                case 2:
                    System.out.println("Developer: YoItzPhoenx");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Press Enter to continue...");
            scanner.nextLine();
            scanner.nextLine();
        }
    }
}
