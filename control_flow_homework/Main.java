package control_flow_homework;

public class Main {

    // problem 1
    // write a program to check if a number is odd or even using a comparison operator and if statement
    public static void problem_1(int number){
        if (number % 2 == 0) { //even
            System.out.println("Even\n");
        }
        else{
            System.out.println("Odd\n");
        }
    }

    // problem 2
    // write a program to check if a letter is a vowel or not using a comparison operator and switch statement
    public static void problem_2(char letter){
        boolean isVowel;
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': isVowel = true;
                break;
            default:
                isVowel = false;
                break;
        }
        if (isVowel){
            System.out.printf("%c is a vowel\n", letter);
        }
        else{
            System.out.printf("%c is not a vowel\n", letter);
        }
    }

    // problem 3
    // write a program that only prints out even numbers between the ranges of 10 to 30 using a comparison operator and for loop
    public static void problem_3(){
        for(int i = 10; i <= 30; i++){
            System.out.println(i);
        }
    }

    // problem 4
    // write a program that prints out every single character in a string using a for loop
    public static void problem_4(String word){
        // for (initial value, up to what value, increment value)
        for(int i =0 ; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }

    public static void main(String[] args) {


        // problem 1
        int number = 2;
        problem_1(number);

        // problem 2
        char letter = 'c';
        problem_2(letter);

        // problem 3
        problem_3();

        // problem 4
        String s = "hello";
        problem_4(s);

    }
}
