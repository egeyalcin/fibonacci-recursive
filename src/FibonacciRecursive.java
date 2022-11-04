public class FibonacciRecursive {
    static int fibonacci(int howMuch) {
        int i = 0;
        int a = 0,b = 1,c;
        while (i < howMuch) {
            c = a + b;
            a=b;
            b=c;
            i++;
            System.out.println(c);
        }

        return fibonacci(5);
    }
    public static void main(String[] args) {
        fibonacci(5);

    }
}
