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

        int x1 = Integer.parseInt(coord1.substring(1, coord1.indexOf(",")));
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(" ") + 1, coord1.indexOf(")")));

        int x2 = Integer.parseInt(coord2.substring(1, coord2.indexOf(",")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(" ") + 1, coord2.indexOf(")")));

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
