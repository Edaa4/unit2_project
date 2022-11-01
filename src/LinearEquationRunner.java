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

        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        if (x1 == x2) {
            System.out.println("these points are on a vertical line: x = " + x1);
        }
        else {
            System.out.println(equation.lineInfo());
            System.out.print("Enter a value for x: ");
            double ecks = scan.nextDouble();
            System.out.println("Coordinate for x: " + equation.coordinateForX(ecks));
        }
        scan.close();
    }
}
