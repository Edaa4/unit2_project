import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String [] args){
        System.out.println("Hello! Welcome to this very super awesome cool linear equation solver!!");
        System.out.println("Enter 2 coordinates, and we'll do the rest ;)");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first coordinate: ");
        String coord1 = scan.nextLine();
        System.out.println();
        System.out.print("Enter the second coordinate: ");
        String coord2 = scan.nextLine();
        scan.close();

        int x1 = Integer.parseInt(coord1);
        System.out.println(x1);
    }
}
