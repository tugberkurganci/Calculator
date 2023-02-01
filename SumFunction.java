public class SumFunction extends AbstractMathFunction {
    public SumFunction() {
        super("sum");
    }

    @Override
    public double calculate(double number1, double number2) {
        return number1+number2;
    }
}
