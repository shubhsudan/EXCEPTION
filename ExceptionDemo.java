public class ExceptionDemo {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                if (number < 0 || number > 15) {
                    throw new FactorialException(number);
                }
                long factorial = factorial(number);
                System.out.println("Factorial of " + number + " is " + factorial);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Ill-formed command-line argument: " + arg);
            } catch (FactorialException e) {
                System.out.println(e.toString());
            }
        }
    }
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

