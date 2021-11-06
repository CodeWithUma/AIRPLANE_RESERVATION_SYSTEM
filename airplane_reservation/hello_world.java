import java.util.Scanner;
public class hello_world {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("HI! WELCOME TO UMA'S AIRLINE RESERVATION SYSTEM");
        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("PLEASE CHOOSE ONE AMONG THE FOLLOWING OPTIONS:- ");
        System.out.println();

        System.out.println("PLEASE CHOOSE ONE TRIP AMONG THE FOLLOWING THE FOLLOWING TRIPS:- ");
        System.out.println("1. ONE_WAY_TRIP");
        System.out.println("2. ROUND_TRIP");
        System.out.println("3. MULTI_CITY_TRIP");
        System.out.println();

        Scanner keyboard = new Scanner(System.in);
        int choice;
        int ONE_WAY_TRIP = 1;
        int ROUND_TRIP = 2;
        int MULTI_CITY_TRIP = 3;

        do{
            System.out.println("Choose option between 1 and 3");
            choice = keyboard.nextInt();
        } while (choice > 3 || choice < 1);
        if (choice == 1) {
            System.out.println("1. ONE_WAY_TRIP");
        } else if (choice == 2) {
            System.out.println("2. ROUND_TRIP");
        } else if (choice == 3) {
            System.out.println("3. MULTI_CITY_TRIP");
        } else if (choice > 3 || choice < 1) {
            System.out.println("Try again.");
        }
    }
}