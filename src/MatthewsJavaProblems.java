public class MatthewsJavaProblems {

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
    }

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

}
