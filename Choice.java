import java.util.Scanner;

public class Choice {
    public static int createChoice(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What action would you like to do?");
        System.out.println("1-Gathering");
        System.out.println("2-Removal");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("5-Mode Taking");
        System.out.print("Choice :");
        int choice = scanner.nextInt();
        return choice;
    }
}
