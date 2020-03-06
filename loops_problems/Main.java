package loops_problems;
import java.util.Arrays;
public class Main {


     // 1. check if two strings are anagrams of each other - otto otto, race ecar, racecar racecar
     public static boolean problem_1(String word1, String word2){

         // first remove all spaces using String method .replaceAll()
         // https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
         word1 = word1.replaceAll(" ", "");
         word2 = word2.replaceAll(" ", "");

         // change all characters into lowercase
         word1 = word1.toLowerCase();
         word2 = word2.toLowerCase();

         System.out.println(word1);
         System.out.println(word2);

         // Convert into array
         char[] arrWord1 = word1.toCharArray();
         char[] arrWord2 = word2.toCharArray();

         // use result to return result to main loop
         boolean result = true;

         // first check to see if the lengths are even the same
         if (word1.length() != word2.length()) {
             return false;
         }
         else{
             // you can check by sorting the arrays and if they are the same,
             // then they are anagrams
             // You can use Array library's built in method to sort
             // https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
             Arrays.sort(arrWord1);
             Arrays.sort(arrWord2);
             if (Arrays.equals(arrWord1, arrWord2)){
                 return true;
             }
             else{
                 return false;
             }
         }
     }


     // 2. reverse a string
     public static String problem_2(String word){

         // Convert into array
         char[] arrWord = word.toCharArray();
         char[] reversedWord = new char[word.length()]; // this initializes a string to a size of reversed word
         int index = 0;
         for(int i = word.length() - 1; i >= 0 ; i --){
             reversedWord[index] = arrWord[i];
             index++;
         }
         String result = new String(reversedWord);// remember to return result as a String
         return result;
     }


     // 3. sort an array of numbers
     public static int[] problem_3(int[] num_array){
         for(int i = 0; i < num_array.length - 1; i ++){
             for(int j = 1; j < num_array.length - i; j++){
                if (num_array[j-1] > num_array[j]){
                    // swap
                    int temp = num_array[j];
                    num_array[j] = num_array[j-1];
                    num_array[j-1] = temp;
                }
             }
         }
         return num_array;
     }


    public static void main(String[] args) {
	// write your code here
        String word1 = "race a car";
        String word2 = "A CAR race";
        boolean value = problem_1(word1, word2);
        System.out.println(value);

        String forward_string = "hello there";
        String output = problem_2(forward_string);
        System.out.println(output);

        int[] num_array = {2,5,1,3,7,3};
        int[] sorted_array = problem_3(num_array);
        for (int i = 0; i < num_array.length; i++){
            System.out.print(num_array[i] + " ");
        }
    }
}
