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
        boolean y = true;
        if (x && y){ // true
            System.out.printf("true");
        }
        else if (x == y){
            System.out.printf("true");
        }
        else{ // false
            System.out.printf("false");
        }
    }

    // ternary operator
    public static void ternary_operator(){
        // simpler form of an if statement
        // condition ? value returned if cond true : value returned if cond false
        int temp = 3 > 2 ? 10 : 15;
        //System.out.printf("%d", temp);

    }

    // for loops, continue, and break statements
    public static void forloops_continue_break() {
        for (int j=0; j<=6; j++)
        {
            if (j==4)
            {
                continue;
            }
            if (j == 6)
            {
                break;
            }
            System.out.println(j+" ");
        }
    }

    //switch statement
    public static void switch_statement(){
        // similar to if but each case is based on a single value
        // switch (variable (byte, short, chart, int, String) for switch)
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

        String text = "bye";
        switch (text)
        {
            case "hello":
                System.out.println(text);
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

        if_statement_comparison_operators();
        ternary_operator();
        switch_statement();
        forloops_continue_break();
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