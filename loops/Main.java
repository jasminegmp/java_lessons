package loops;

/*
* For statement
* word length
* */

public class Main {

    // string arrays - for loop
    // other string methods https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
    public static void string_array(String word){

        // length()
        for(int i =0 ; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }

    // number arrays - for loop
    public static void number_array(int[] numbers){

        // length
        for(int i =0 ; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    // while statement
    public static void while_loop(int count){
        while(count > 0) {
            System.out.println(count);
            count--;
        }
    }


    public static void main(String[] args) {

        //String s = "hello";
        //string_array(s);

        //int[] n = {1,2,3,4,5};
        //number_array(n);

        int count = 10;
        while_loop(count);
    }
}

/*
* suggested problems
* 1. check if two strings are anagrams of each other
* 2. reverse a string
* 3. sort an array of numbers
*
* */