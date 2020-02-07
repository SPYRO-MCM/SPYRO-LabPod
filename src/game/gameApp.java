package game;

import java.util.Random;
import java.util.Scanner;

public class gameApp extends asciiArt {

    static Scanner scanner = new Scanner(System.in);
    static int playerHealth = 20;
    static int eddyHealth = 8;
    static int laryHealth= 3;
    static int healthPotions = 2;
    static Random rand = new Random();
    static String name;
    public static String greeting = "Greetings %s, I hope you have prepared for the battle ahead... My name is Bob and I'll be with you during the adventure today!";


    public static void main(String[] args) {


        System.out.print(printString(cityStart));

        System.out.print("\n\nEnter [y/n] to start\n");
        letsPlay();



    }

    public static void letsPlay() {
        String option = scanner.next();
        if (option.equalsIgnoreCase("y") || option.equalsIgnoreCase("yes")) {
            System.out.println("\nEnter your name..\n");
            name = scanner.next();
            System.out.printf("\nGreetings %s, I hope you have prepared for the battle ahead... My name is Bob and I'll be with you during the adventure today!\n", name);
            System.out.println("The city is in great chaos! The monkeys have let some of the animals out of the Zoo!\n");
            System.out.println("Darn primates, I always knew they were up to no good......\n");
            System.out.println("So far we know a total of 3 monkeys, 1 lemur, a giraffe, and the star of our Zoo, Eddy the Elephant are running loose!\n");
            System.out.println("\nTake this bag, you'll need it later!\n");
            System.out.println("Inventory:");
            System.out.println("1 rope");
            System.out.println("2 health potions");
            System.out.println("1 medium sized net");
            System.out.println("1 red flag");
            System.out.println("A Mystery Snack..?");
            System.out.printf("\n%s, here comes Eddy now!..\n", name);
            System.out.print(printString(elephant));


            System.out.printf("[Your Health: %d] [Animals Combined Health: %d]\n", playerHealth, eddyHealth);
            System.out.printf("\n%s I sure hope you know what you're doing.. Eddy is starting to run right for you!..\n", name);

            eddy();
        } else {
            System.out.println("Goodbye...\n");
        }
    }

    public static void eddy() {
        System.out.printf("\n%s, What would you like to do?\n", name);

        System.out.print("\na: Attempt to Lasso Eddy with the rope");
        System.out.print("\nb: Approach Eddy talking softly, and try to ride eddy back to the zoo with the rope");
        System.out.print("\nc: Throw the net at Eddy");
        System.out.print("\nd: RUN!\n");
        String inputEnter3 = scanner.next();
        switch (inputEnter3) {
            case ("a"):
                playerHealth -= rand.nextInt(5) + 1;
                eddyHealth -= rand.nextInt(3) + 1;
                System.out.println("Eddy swipes you with his husk!\n");
                System.out.printf("[Your Health: %d] [Animals Combined Health: %d]\n", playerHealth, eddyHealth);
                eddyHealth();
                break;
            case ("b"):
                eddyHealth -= rand.nextInt(3) + 1;
                playerHealth -= rand.nextInt(3) + 1;
                System.out.println("Eddy started to cooperate, but got spooked!\n");
                System.out.printf("[Your Health: %d] [Animals Combined Health: %d]\n", playerHealth, eddyHealth);
                eddyHealth();
                break;
            case ("c"):
                playerHealth -= rand.nextInt(6) + 1;
                System.out.println("Oops.... Eddy is too big for that net...\n");
                System.out.printf("[Your Health: %d] [Animals Combined Health: %d]\n", playerHealth, eddyHealth);
                System.out.println("Not a great choice, Eddy pretty much ran you over!!!\n");
                eddyHealth();
                break;
            case ("d"):
                System.out.println("Well, some help you were...\n");
                System.out.println("Game Over...\n");
                break;
            default:
                eddyHealth();


        }
    }

    public static void eddyHealth() {
        if (playerHealth <= 0) {
            System.out.println("You have been defeated by Eddy!\n");
            System.out.println("Drink a health potion to help gather the other animals? [y/n]\n");
            String inputEnter4 = scanner.next();
            if (inputEnter4.equalsIgnoreCase("y")) {
                healthPotions -=1;
                playerHealth += 6;
                System.out.printf("[Your Health: %d] [Animals Combined Health: %d]\n", playerHealth, eddyHealth);
                eddy();
            } else {
                System.out.println("Game Over...\n");
                return;
            }
        } else if (eddyHealth <= 0) {

            System.out.println("You Defeated Eddy! He has reached exhaustion and can be safely transported back to the zoo!\n");
            System.out.printf("\nGood job, %s.\n", name);
            System.out.println("Uh-oh! I think I just saw Lary the Lemur head towards the mountains!\n");
            System.out.println(mountain);
            System.out.printf("\n%s do you know ANYTHING about lemurs..? Lary isn't a huge fan of people, but I sure do hope he likes you!\n", name);
            lary();

        } else if (playerHealth <= 0 && eddyHealth <= 0) {
            System.out.println("You were almost defeated by Eddy!\n");
            System.out.printf("%d :life potions remaining. Drink a health potion to help gather the other animals? [y/n]\n", healthPotions);
            String inputEnter3 = scanner.next();
            if (inputEnter3.equalsIgnoreCase("y")) {
                healthPotions -= 1;
                playerHealth += 6;
                System.out.printf("[Your Health: %d] [Animals Combined Health: %d]\n", playerHealth, laryHealth);
                System.out.println("You Defeated Eddy! He has reached exhaustion and can be safely transported back to the zoo!\n");
                //next function call
            } else {
                System.out.println("Game Over...\n");
                return;
            }
        }else {
            eddy();
        }
    }


    public static void lary() {

        System.out.printf("\n%s, What would you like to do?\n", name);
        System.out.print("\na: Try to get Lary's attention by waving the red flag");
        System.out.print("\nb: Open up the Mystery Snack");
        System.out.print("\nc: Lary is better off free..");
        System.out.print("\nd: Throw the net at Lary\n\n");

        String inputEnter3 = scanner.next();
        switch (inputEnter3) {
            case ("a"):
                playerHealth -= rand.nextInt(5) + 1;
                System.out.println("Lary ignores you stubbornly.. waving that sure looks tiring..\n");
                System.out.printf("[Your Health: %d] [Animals Combined Health: %d]\n", playerHealth, laryHealth);
                laryHealth();
                break;
            case ("b"):
                laryHealth -= 1;
                System.out.println("Lary perks up and heads right towards you! The mystery snack is melon, his favorite! Eating makes Lary sleepy!\n");
                System.out.printf("[Your Health: %d] [Animals Combined Health: %d]\n", playerHealth, laryHealth);
                laryHealth();
                break;
            case ("c"):
                System.out.println("\nWell, then...\n");
                System.out.println("Game Over...\n");
                break;
            case ("d"):
                laryHealth -= 2;
                playerHealth -= rand.nextInt(2) + 1;
                System.out.println("The net hits Lary and he starts to panic, you get scratched while trying to fully restrain him!\n");
                System.out.printf("[Your Health: %d] [Animals Combined Health: %d]\n", playerHealth, eddyHealth);
                laryHealth();
                break;
            default:
                laryHealth();


        }


    }
    public static void laryHealth() {
        if (playerHealth <= 0) {
            System.out.println("You have been defeated by Lary!\n");
            System.out.printf("%d :life potions remaining. Drink a health potion to help gather the other animals? [y/n]\n", healthPotions);
            String inputEnter4 = scanner.next();
            if (inputEnter4.equalsIgnoreCase("y")) {
                healthPotions -=1;
                playerHealth += 6;
                System.out.printf("[Your Health: %d] [Animals Combined Health: %d]\n", playerHealth, eddyHealth);
                //next round function call
            } else {
                System.out.println("Game Over...\n");
                return;
            }
        } else if (laryHealth <= 0) {

            System.out.println("You Defeated Lary! He has reached exhaustion and can be safely transported back to the zoo!\n");
            System.out.printf("\nGood job, %s.\n", name);
            //next function call

        } else if (playerHealth <= 0 && laryHealth <= 0) {
            System.out.println("You have almost been defeated by Lary!\n");
            System.out.printf("%d :life potions remaining. Drink a health potion to help gather the other animals? [y/n]\n", healthPotions);
            String inputEnter3 = scanner.next();
            if (inputEnter3.equalsIgnoreCase("y")) {
                healthPotions -= 1;
                playerHealth += 6;
                System.out.printf("[Your Health: %d] [Animals Combined Health: %d]\n", playerHealth, laryHealth);
                System.out.println("You Defeated Lary! He has reached exhaustion and can be safely transported back to the zoo!\n");
                //next function call
            } else {
                System.out.println("Game Over...\n");
                return;
            }
        }else {
            lary();
        }
    }


}
