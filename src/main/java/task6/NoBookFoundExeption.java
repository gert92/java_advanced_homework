package task6;

public class NoBookFoundExeption extends Exception{
    public NoBookFoundExeption(String errorMessage) {
        super(errorMessage);
    }
}
