package example_1;

public class Main {

    public static void isEven(int x){ // function
        int remainder = x % 2;

        if (remainder == 0 ){
            System.out.println("Even!");
        }
        else{
            System.out.println("Odd!");
        }
    }

    public static void function2(){

    }

    // main is always last
    public static void main(String[] args) { // main is a function
        int a = 11;
        isEven(a);
    }
}
