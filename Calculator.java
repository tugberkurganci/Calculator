import java.util.Scanner;

public class Calculator {
    private  int functionCount;

    private int currentCount=0;
    private IMathFunction [] functions;

    public Calculator(int functionCount) {
        this.functionCount = functionCount;
        functions = new IMathFunction[functionCount];
    }
    public void addFunction(IMathFunction function) {
        functions[currentCount] = function;
        currentCount++;
    }
    public double doCalculation(String functionName, double arg1,double arg2) {
        double result = 0.0;
        boolean isFunctionFound = false;
        for (IMathFunction function : functions) {
            if (functionName.equalsIgnoreCase(function.getName())) {
                result = function.calculate(arg1,arg2);
                isFunctionFound = true;
            }
        }
        if(!isFunctionFound)
            System.out.println("No such function found!");

        return result;
    }

    public void listMathFunction() {
        System.out.println("Available Functions:");
        for (IMathFunction function : functions)
            System.out.println(function.getName());
    }
    public static void startCalculator(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);
        calculator.listMathFunction();
        System.out.println("end");
        System.out.print("Please enter the name of the function:");
        String functionName = scanner.next();
        if(functionName.equalsIgnoreCase("end"))
            System.exit(0);
        System.out.print("Please enter the first argument of the function:");
        double functionArg1 = scanner.nextDouble();
        System.out.print("Please enter second the argument of the function:");
        double functionArg2 = scanner.nextDouble();
        double result = calculator.doCalculation(functionName, functionArg1,functionArg2);
        System.out.println(functionName + " of " + functionArg1+"and"+functionArg2 + " is =" + result );

        startCalculator(calculator);
    }
}


