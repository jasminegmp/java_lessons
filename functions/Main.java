package functions;

public class Main {

    /*
    Write a Java program that takes two numbers as input and display the product of two numbers
    three data types, y = a * b
     */

    public static int find_product(int x, int y){ // function
        int product = x*y;
        return product;
    }

    public static void print_product(int x, int y){ // function
        int product = x*y;
        System.out.printf("Product is %d", product);
    }

    public static double find_circumference(int r, int a){
        double circumference = 2 * Math.PI * r;
        return circumference;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int a = 200;

        double circumference = find_circumference(x, a);
        System.out.println("\n" + circumference);

        int output = find_product(x,y); // ----> [function] --> // x,y -- > f(x,y)  --> output
        System.out.printf("\nProduct of %d and %d is %d", x, y, output);

        print_product(x,y);

    }
}
