public abstract class AbstractMathFunction implements IMathFunction {
    private  String name;
    public AbstractMathFunction(String name) {
        this.name = name;
    }

    @Override
    public final String getName() {
        return name;
    }
}


