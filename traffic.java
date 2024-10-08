import java.util.Scanner;

class traffic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String color;

        System.out.println("\nEnter 'exit' to stop the program.");

        while (true) {
            System.out.print("\nEnter a traffic light color (red, yellow, green): ");
            color = s.nextLine();

            switch (color) {
                case "red":
                    System.out.println("Action: Stop");
                    break;

                case "yellow":
                    System.out.println("Action: Prepare to stop");
                    break;

                case "green":
                    System.out.println("Action: Go");
                    break;

                case "exit":
                    System.out.println("Exiting the program. Goodbye!");
                    return;    

                default:
                    System.out.println("Invalid input. Please enter Red, Yellow, or Green.");
            }
        }
    }
}
