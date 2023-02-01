public class ModeFunction extends AbstractMathFunction{
    public ModeFunction() {
        super("mode");
    }

    @Override
    public double calculate(double number1, double number2) {
        return number1%number2;
    }
}
