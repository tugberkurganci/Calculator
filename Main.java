import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Calculator calculator1 = new Calculator(5);
        calculator1.addFunction(new SumFunction());
        calculator1.addFunction(new RemovalFunction());
        calculator1.addFunction(new MultiFunction());
        calculator1.addFunction(new DivisionFunction());
        calculator1.addFunction(new ModeFunction());



        Calculator.startCalculator(calculator1);
    }


    }

