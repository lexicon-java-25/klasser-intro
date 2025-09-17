import java.util.Scanner;

public class InputHandler {

    private static Scanner scanner = new Scanner(System.in);

    public static String getStringInput(){
        return scanner.nextLine();
    }

    public static int getIntInput(){

        while (!scanner.hasNextInt()){
            System.out.println("fel input, skriv ett heltal");
            scanner.nextLine();
        }

        int i = scanner.nextInt();
        scanner.nextLine();
        return i;
    }



}
