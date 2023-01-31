import java.util.Scanner;

public class Calculator implements Isum, Iremoval, Imulti, Imode, Idivision {

    private int number1;
    private int number2;
    private int choice;

    public void calculus() {

            //ı use static effact
            setChoice(Choice.createChoice());
            if (choice > 0 && choice < 6) {

            setNumber1(numberTaker1());
            setNumber2(numberTaker2());

            if (this.choice == 1) System.out.print("Result: " + sum(this.number1, this.number2));
            if (this.choice == 2) System.out.print("Result: " + removal(this.number1, this.number2));
            if (this.choice == 3) System.out.print("Result: " + multiplication(this.number1, this.number2));
            if (this.choice == 4) System.out.print("Result: " + division(this.number1, this.number2));
            if (this.choice == 5) System.out.print("Result: " + mode(this.number1, this.number2));

        }
    }

    public int numberTaker1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int firstNumber = scanner.nextInt();
        return firstNumber;
    }

    public int numberTaker2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int secondNumber = scanner.nextInt();
        return secondNumber;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }


    @Override
    public int removal(int firstNumber, int secondNumber) {
        return Iremoval.super.removal(firstNumber, secondNumber);
    }

    @Override
    public int sum(int firstNumber, int secondNumber) {
        return Isum.super.sum(firstNumber, secondNumber);
    }

    @Override
    public int division(int firstNumber, int secondNumber) {
        return Idivision.super.division(firstNumber, secondNumber);
    }

    @Override
    public int mode(int firstNumber, int secondNumber) {
        return Imode.super.mode(firstNumber, secondNumber);
    }

    @Override
    public int multiplication(int firstNumber, int secondNumber) {
        return Imulti.super.multiplication(firstNumber, secondNumber);
    }
}
