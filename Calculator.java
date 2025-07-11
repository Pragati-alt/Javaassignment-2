public class Calculator {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }

    void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Quotient: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(20, 15);
        calc.subtract(20, 15);
        calc.multiply(20,15);
        calc.divide(20, 15);
    }
}
