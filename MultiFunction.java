public class MultiFunction extends AbstractMathFunction{
    public MultiFunction() {
        super("multi");
    }

    @Override
    public double calculate(double number1, double number2) {
        return number1*number2;
    }
}
