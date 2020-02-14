public class MatthewsJavaProblems {

//================================================== WEEK 1 ==========================================================//

// TODO: Problem 1
// Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

    public static boolean mixStart(String str) {
        if (str.length() < 3) return false;
        String two = str.substring(1, 3);
        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }

// TODO: Problem 2
// Given two temperatures, return true if one is less than 0 and the other is greater than 100.

    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

// TODO: Problem 3
// Given three int values, a b c, return the largest.

    public static int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

//================================================== WEEK 2 ==========================================================//

// TODO: Problem 1
// Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

// TODO: Problem 2
// Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

    public static String backAround(String str) {
        // Get the last char
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

// TODO: Problem 3
//Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    public static int sumDouble(int a, int b) {
        // Store the sum in a local variable
        int sum = a + b;
        // Double it if a and b are the same
        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        // TODO: For Week 1 - Problem 1
//        System.out.println(mixStart("mix"));
//        System.out.println(mixStart("pix"));
//        System.out.println(mixStart("cool"));
        // TODO: For Week 1 - Problem 2
//        System.out.println(icyHot(5,10));
//        System.out.println(icyHot(-1,101));
        // TODO: For Week 1 - Problem 3
//        System.out.println(intMax(5,10,100));
//        System.out.println(intMax(100,1000,10000));
        // TODO: For Week 2 - Problem 1
          System.out.println(notString("candy"));
          System.out.println(notString("x"));
          System.out.println(notString("not bad"));
        // TODO: For Week 2 - Problem 2
          System.out.println(backAround("cat"));
          System.out.println(backAround("Hello"));
          System.out.println(backAround("a"));
        // TODO: For Week 2 - Problem 3
          System.out.println(sumDouble(1, 2));
          System.out.println(sumDouble(3, 2));
          System.out.println(sumDouble(2, 2));
    }

}




