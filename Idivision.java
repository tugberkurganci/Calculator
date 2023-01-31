public interface Idivision {
    default int division(int firstNumber, int secondNumber){
        int result=0;
        if (secondNumber==0) {
            System.out.println("You can't enter zero");
        }else result=firstNumber/secondNumber;
        return result;
    }
}
