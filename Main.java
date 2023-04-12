import java.util.Scanner;
import Calculator.*;

public class Main {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        String input;

        System.out.println("Instructions:\nInput: \"stop\" to exit the calculator, \"clear\" to clear all previous inputs, or \"history\" to show previous calculations.\nUse the following operators or functions to use the calculator: *, /, +, -, ^, %, log, sin, arcsin, cos, arcos, tan, arctan, abs, !.\nFor exponents the first number is the exponent base and the second number is the exponent.\nFor logarithms the first number is the number inputed in the logarithm and the second number is the logarithm base.\nUse \"pi\" for PI and \"e\" for the mathematical constant.");
        System.out.println("\nEnter a function or operation");

        Addition add = new Addition(scan, "+");
    }
}
