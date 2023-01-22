import java.util.Scanner;

public class Calculator {

    public void calculus() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What action would you like to do?");
        System.out.println("1-Gathering");
        System.out.println("2-Removal");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("5-Mode Taking");
        System.out.print("Choice :");

        int choice = scanner.nextInt();

        if (choice > 0 && choice < 6) {

            System.out.print("Enter the first number :");
            int firstNumber=scanner.nextInt();
            System.out.print("Enter the second number :");
            int secondNumber=scanner.nextInt();

            if (choice==1) System.out.print("Result: "+sum(firstNumber,secondNumber));
            if (choice==2) System.out.print("Result: "+removal(firstNumber,secondNumber));
            if (choice==3) System.out.print("Result: "+multiplication(firstNumber,secondNumber));
            if (choice==4) System.out.print("Result: "+division(firstNumber,secondNumber));
            if (choice==5) System.out.print("Result: "+mode(firstNumber,secondNumber));

        }
    }

    public int sum(int firstNumber,int secondNumber){
       return firstNumber+secondNumber;
    }
    public int removal(int firstNumber,int secondNumber){
        return firstNumber-secondNumber;
    }
    public int multiplication(int firstNumber,int secondNumber){
        return firstNumber*secondNumber;
    }
    public int division(int firstNumber, int secondNumber){
        int result=0;
        if (secondNumber==0) {
            System.out.println("You can't enter zero");
        }else result=firstNumber/secondNumber;
        return result;
    }
    public int mode(int firstNumber,int secondNumber){
        return firstNumber%secondNumber;
    }
}
