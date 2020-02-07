package game;

import java.util.Scanner;

public class methods {
    static Scanner scanner = new Scanner(System.in);

    public static String printString (String name){
        return name;
    }
    public static String getString(String prompt){
        String answer;
        System.out.println(prompt);
        answer = scanner.next();
        return answer;
    }
}
