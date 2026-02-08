class Calculator {
    public int add(int n1, int n2) { return n1 + n2; }
    public int multiply(int n1, int n2) { return n1 * n2; }
    public int square(int n1) { return n1 * n1; }
}

public class IT25103746Q5{
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // 1. (3*4 + 5*7)^2 
        int exp1 = calc.square(calc.add(calc.multiply(3, 4), calc.multiply(5, 7)));
        System.out.println("Result 1: " + exp1);

        // 2. (4+7)^2 + (8+3)^2
        int exp2 = calc.add(calc.square(calc.add(4, 7)), calc.square(calc.add(8, 3)));
        System.out.println("Result 2: " + exp2);
    }
}
