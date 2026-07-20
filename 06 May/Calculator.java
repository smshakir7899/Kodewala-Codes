@FunctionalInterface
interface SquareRootCalculator {
double calculate(int y);
}

public class Calculator {
public static void main (String[] args) {
SquareRootCalculator SquareRoot = (int y) -> Math.sqrt(y);
 double result = squareRoot.calculate(y=25);
System.out.println("SquareRoot: " + result);
}
}