public class RemovalFunction extends AbstractMathFunction{
    public RemovalFunction() {
        super("removal");
    }

    @Override
    public double calculate(double number1, double number2) {
        return number1-number2;
    }
}
