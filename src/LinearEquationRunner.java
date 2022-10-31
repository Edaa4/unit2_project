import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String [] args) throws ParseException {
        System.out.println("Hello! Welcome to this very super awesome cool linear equation solver!!");
        System.out.println("Enter 2 coordinates, and we'll do the rest ;)");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first coordinate: ");
        String coord1 = scan.nextLine();
        System.out.println();
        System.out.print("Enter the second coordinate: ");
        String coord2 = scan.nextLine();
        scan.close();

        coord1 = coord1.replaceAll("\\D", " ");
        String [] coord1arr = coord1.split(" ", 5);
        int x1 = Integer.parseInt(coord1arr[1]);
        int y1 = Integer.parseInt(coord1arr[3]);

        coord2 = coord2.replaceAll("\\D", " ");
        String [] coord2arr = coord2.split(" ", 5);
        int x2 = Integer.parseInt(coord2arr[1]);
        int y2 = Integer.parseInt(coord2arr[3]);

        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);
    }
}
