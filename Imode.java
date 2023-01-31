public interface Imode {
    default int mode(int firstNumber,int secondNumber){
        return firstNumber%secondNumber;
    }
}
