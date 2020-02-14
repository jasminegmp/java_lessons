package hw_1;

public class Main {

    /*
    Write a Java program that takes two numbers as input and display the product of two numbers
    three data types, y = a * b
     */
    public static int find_product(int x, int y){ // function
        return x*y;
    }

    /*
    Write a Java program to swap two variables.
     */
    public static int[] swap_values(int x, int y){ // function
        int temp_y = y;
        int[] result = new int[2];

        y = x;
        x = temp_y;
        result[0] = x;
        result[1] = y;
        return result;
    }

    /*
    Write a Java program to print the area and perimeter of a circle.
    */
    public static double[] find_area_perimeter(int r){ // function
        double[] result = new double[2];
        double perimeter = 2* Math.PI *r; // Math.PI uses a double
        double area = Math.PI * r * r;
        result[0] = perimeter;
        result[1] = area;
        return result;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int output = find_product(x,y);
        System.out.printf("Product of %d and %d is %d", x, y, output);

        int[] output_2 = swap_values(x,y);
        System.out.printf("\nPrevious values of X: %d and Y: %d", x, y);
        System.out.printf("\nSwapped values of X: %d and Y: %d", output_2[0], output_2[1]);

        double[] output_3 = find_area_perimeter(x);
        System.out.printf("\nPerimeter of circle for radius %d is : %f", x, output_3[0]);
        System.out.printf("\nArea of circle for radius %d is : %f", x, output_3[1]);

    }
}
