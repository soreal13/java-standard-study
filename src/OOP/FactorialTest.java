package OOP;

public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    static int factorial(int n) {

        if (n <= 0 || n > 20 ) {
            return -1;
        } else if (n <= 1) {
            return 1;
        } else {
            int result = 0;

            if ( n == 1 ) {
                result = 1;
            } else {
                result = n * factorial(n-1);
            }
            return result;
        }

    }
}
