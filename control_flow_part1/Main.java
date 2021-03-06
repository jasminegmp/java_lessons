package lesson_2;

public class Main {

    // if statement and comparison operators
    public static void if_statement_comparison_operators(){
        /*
        If, else if, else, statements
        Nested if statements

        Comparison Operators: Evaluates statement and returns a boolean value
        Example: ==, !=, >, <, >=, <=, &&, ||
         */
        boolean x = true;
        boolean y = false;

        if (x || y)
        {
            if(x && y)
            {
                System.out.println("True!");
            }
            else {
                System.out.println("False!");
            }
        }
        else{
            System.out.println("False!");
        }
    }

    // for loops, continue, and break statements
    public static void forloops_continue_break() {

        for (int j=0; j<10; j++)
        {
            // 0 1 2 3 4  hey you reached five here 5 6 7 8 9
            if (j == 5){
                System.out.println("hey you reached five here!");
                continue;
            }
            System.out.println(j);
        }

    }

    // problem 4
    // write a program that prints out every single character in a string using a for loop
    public static void problem_4(){

        // [1,2,3,4,5,6]
        // [true, false ,true]

        char inputArray = ['h','e','l','l','o'];
        // length - 1: 5-1 = 4
        System.out.println("%c", inputArray[0]); // 'h'
        System.out.println("%c", inputArray[4]); // 'o'

        // for (initial value, up to what value, increment value)
        for(int i =0 ; i <= 4; i++) {
            System.out.println("%c", inputArray[i]);// 'h', 'e', 'l',
        }
    }

    // problem 5
    // write a program that prints out every single character in a string using a for loop
    public static void problem_5(){

        //[0,2,4,6,8,10]
        int array = [0,1,2,3,4,5,6,7,8,9,10];

        // for (initial value, up to what value, increment value)
        for(int i = 0 ; i <= 10; i+=2) { // 0, 2,4,6,8,10
            System.out.println("%d", array[i]);//
        }

    }

    //switch statement
    public static void switch_statement(){
        // similar to if but each case is based on a single value
        // switch (variable (byte, short, char, int, String) for switch)
        // {
            // case first:
                // do something;
                // break;
            // case second:
                // do something else;
                // break;
            // default:
                // do something even different;
                // break;
        // }

        int input = 100;
        switch (input) // "bye"
        {
            case 1: // 1 == 1?
                System.out.println(input);
                break;
            case 2: // 2 == 1?
                System.out.println(input);
                break;
            default:
                System.out.println("didn't find anything");
                break;

        }
        /*
        additional notes
         * switch(1+2+23) valid
         * switch(1*2+3%4) valid
         * switch(ab+cd) invalid
         * switch(a+b+c) invalid
         */
    }

    public static void main(String[] args) {

        //if_statement_comparison_operators();
        //ternary_operator();
        //switch_statement();
        //forloops_continue_break();
        problem_4();
    }
}


/*
* Suggested practice problems
*
* 1. write a program to check if a number is odd or even using a comparison operator and if statement
* 2. write a program to check if a letter is a vowel or not using a comparison operator and switch statement
* 3. write a program that only prints out even numbers between the ranges of 10 to 30 using a comparison operator and for loop
* 4. write a program that prints out every single character in a string using a for loop
*
* */