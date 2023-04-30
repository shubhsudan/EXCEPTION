public class FactorialException extends Exception {
    private int number;
    public FactorialException(int number) {
        super();
        this.number = number;
    }
    @Override
    public String toString() {
        return "FactorialException: Invalid input, the number should be between 0 and 15. Given number: " + number;
    }
}