import java.util.Scanner;
import Calculator.*;

public class Main {
    static String sentinel = "stop";
    static boolean showHistory = false;
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        String input = "";
        final String[] validInputs = {"*", "/", "+", "-", "^", "%", "log", "sin", "cos", "tan", "arcsin", "arccos", "arctan", "abs", "!"};
        boolean inputIsValid = false, clear = false;
        final History history = new History();

        System.out.println("Instructions:\nInput: \"stop\" to exit the calculator, \"clear\" to clear all previous inputs, or \"history\" to show previous calculations.\nUse the following operators or functions to use the calculator: *, /, +, -, ^, %, log, sin, arcsin, cos, arcos, tan, arctan, abs, !.\nFor exponents the first number is the exponent base and the second number is the exponent.\nFor logarithms the first number is the number inputed in the logarithm and the second number is the logarithm base.\nUse \"pi\" for PI and \"e\" for the mathematical constant.");

        while(true) {
            inputIsValid = false;
            while(!inputIsValid) {
                System.out.println("\nEnter a function, operation, or expression");
                input = scan.nextLine().toLowerCase();
                checkToTerminate(input);
                if(checkToClear(input)) {
                    clear = true;
                    inputIsValid = true;
                }
                if(!clear) {
                    for(int i = 0; i < validInputs.length; i++) {
                        if(input.equals(validInputs[i])) {
                            inputIsValid = true;
                        }
                    }
                    if(!inputIsValid) {
                        System.out.println("\nInvalid Input\n");
                    }
                }
                if(clear) {
                    clear = false;
                }
                if(showHistory) {
                    showHistory = false;
                    history.showHistory();
                }
            }
            if(input.equals("*")) {
                new Multiplication(scan);
            } else if(input.equals("/")) {
                new Division(scan);
            } else if(input.equals("+")) {
                new Addition(scan);
            } else if(input.equals("-")) {
                new Subtraction(scan);
            } else if(input.equals("^")) {
                new Exponents(scan);
            } else if(input.equals("%")) {
                new Modulus(scan);
            } else if(input.equals("log")) {
                new Logarithm(scan);
            } else if(input.equals("sin")) {
                new Sin(scan);
            } else if(input.equals("cos")) {
                new Cos(scan);
            } else if(input.equals("tan")) {
                new TanFunction(scan);
            } else if(input.equals("arcsin")) {
                new Arcsin(scan);
            } else if(input.equals("arccos")) {
                new Arccos(scan);
            } else if(input.equals("arctan")) {
                new Arctan(scan);
            } else if(input.equals("abs")) {
                new Abs(scan);
            } else if(input.equals("!")) {
                new Factorial(scan);
            }
        }
    }

    static void checkToTerminate(String input) {
        if(input.equals(sentinel)) {
            System.exit(0);
        }
    }

    static boolean checkToClear(String input) {
        boolean internalClear = false;
        if(input.equals("history")) {
            internalClear = true;
            showHistory = true;
        } else if(input.equals("clear")) {
            internalClear = true;
        }
        return internalClear;
    }
}
