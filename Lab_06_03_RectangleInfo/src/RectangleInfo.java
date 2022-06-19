import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args)
    {
        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        if (in.hasNextDouble())
        {
            length = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Enter a valid length: " + trash);
        }

        System.out.println("Enter the width of the rectangle: ");
        if (in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Enter a valid width: " + trash);
        }

        area = length * width;
        perimeter = length * 2 + width * 2;
        diagonal = length * length + width * width;

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The diagonal of the rectangle is: " + (Math.sqrt(diagonal)));
    }
}
