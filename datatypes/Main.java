package datatypes;

public class Main {

    public static void main(String[] args) {


	// 1 . Data types

        // Integers - size, range, default value
        byte userAge = 20; // 8 bits, -128 to 127 inclusive, 0
        short numberOfStudents = 45; //16 bits, -32,768 to 32,767 inclusive, 0
        int numberOfEmployees = -2; // 32 bits, -2^31 to 2^31 - 1, 0
        long numberOfInhabitants = -2L; // 64 bits, -2^63 to 2^63-1, 0L

        // Floating point - size, default value
        float hourlyRate = 60.5f; // 32 bits, 0.0f
        double numberOfHours = 5155.50d; // 64 bits, 0.0d

        // Character - size, range, default value
        char grade = 'B'; // 8 bits, 0 to 65,525 inclusive, ''\u0000

        // Boolean -  - size, default value
        boolean likesJuice =  true; // 1 bit, false
        boolean olderThan50 =  false;


    // 2. Variable naming convention
    /*

    You can use _ $ and numbers
    You cannot start with a number
    _username and $username is okay, 1username is not

    Case sensitive
    */

        int isNumber = 10;
        int isnumber = 5;

        // println vs printf
        System.out.printf("isNumber: %d\nisnumber: %d", isNumber, isnumber);
        //System.out.println("\nNumber is " + isNumber);


    // Assignment Operator
        int x = 10;
        int y = 5;

        y = x; // vs x =y
        //System.out.println(y);


    //Basic operators
        /*
        +, -, *, /, +=. -=. *=. ++ before or after
        * */
    // Go over how functions call each other

    // Practice problem ideas:
/*
    Write a Java program that takes two numbers as input and display the product of two numbers
    Write a Java program to add two binary numbers.
    Write a Java program to swap two variables.
    Write a Java program to print the area and perimeter of a circle.
 */


    }
}
