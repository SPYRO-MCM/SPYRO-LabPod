//resources
//https://www.codewars.com/kata/5262119038c0985a5b00029f/train/java
//https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java

//  Exercise 1.
//  Define a function that takes an integer argument and returns logical value true or false depending on if the integer is a prime.
//  Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 6 != 5 && num % 6 != 1) return false;
        int div = 5;
        while (div <= (int) Math.sqrt(num)) {
            if (num % (div) == 0 || num % (div + 2) == 0) return false;
            div += 6;
        }
        return true;
    }

    //   Exercise 2.
//   Given an array of ones and zeroes, convert the equivalent binary value to an integer.
//    Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.get(0) * 8 + binary.get(1) * 4 + binary.get(2) * 2 + binary.get(3) * 1;
    }

//    Exercise 3
//    Given a string of words, you need to find the highest scoring word.
//    Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//    You need to return the highest scoring word as a string.
//    If two words score the same, return the word that appears earliest in the original string.
//    All letters will be lowercase and all inputs will be valid.
    public static String high(String s) {

        int result = 0;
        int result_index = 0;
        List<String> words = new ArrayList<String>(Arrays.asList(s.split(" ")));
        int index = 0;
        for(String word : words){
            int r = 0;
            for(int i=0; i< word.length(); i++){
                char c = word.charAt(i);
                r += (Integer.valueOf(c) - 96);
            }
            if(result < r){
                result = r;
                result_index = index;
            }
            index++;
        }
        return words.get(result_index);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5)); //Should display true
        System.out.println(isPrime(0)); //Should display false
        System.out.println(isPrime(4)); //Should display false


        ArrayList<Integer> binary = new ArrayList<>();
//        binary.add(0);
//        binary.add(0);
//        binary.add(0);
//        binary.add(1);

        binary.add(1);
        binary.add(0);
        binary.add(1);
        binary.add(1);

        System.out.println(ConvertBinaryArrayToInt(binary)); //Should display 11
        System.out.println(high("man i need a taxi up to ubud")); //Should return taxi
        System.out.println(high("what time are we climbing up to the volcano")); //Should return volcano
    }
}
