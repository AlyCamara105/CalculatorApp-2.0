package Calculator;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Expression {
    static final String sentinel = "stop";
    private double result, num1, num2;
    private String operation;
    private final Scanner scan;
    private boolean clear, showHistory;
    private static final History history = new History();


    public Expression(Scanner scan) {
        this.scan = scan;
    }

    public void printResult() {
        if(!clear) {
            String output = "" + num1 + " " + operation + " " + num2 + " is: " + result;
            history.addHistory(output + "\n");
            System.out.println(output);
        }
        if(showHistory) {
            history.showHistory();
        }
    }

    public void printResult(String prompt) {
        if(!clear) {
            history.addHistory(prompt + "\n");
            System.out.println(prompt);
        }
        if(showHistory) {
            history.showHistory();
        }
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void getNumbers(double numbers) {
        if(numbers == 1) {
            setNum1();
        } else {
            setNum1();
            setNum2();
        }
    }

    private void setNum1() {
        num1 = getDouble("Input a number");
    }

    private void setNum2() {
        num2 = getDouble("Input another number");
    }

    private double getDouble(String prompt) {
        boolean excepted = false;
        double num = 0.0;

        do {
            try {
                if(!clear) {
                    excepted = false;
                    System.out.println(prompt);
                    num = scan.nextDouble();
                    scan.nextLine();
                }
            } catch(InputMismatchException exception) {
                String input = scan.nextLine().toLowerCase();
                checkToTerminate(input);
                num = getMathSymbolValue(input);
                if(checkToClear(input)) {
                    clear = true;
                } else if(num == 0.0) {
                    System.out.println("\nInput Invalid\n");
                    excepted = true;
                }
            }
        } while(excepted);
        
        return num;
    }

    private void checkToTerminate(String input) {
        if(input.equals(sentinel)) {
            System.exit(0);
        }
    }

    private double getMathSymbolValue(String input) {
        if(input.equals("e")) {
            return Math.E;
        } else if(input.equals("pi")) {
            return Math.PI;
        } else {
            return 0.0;
        }
    }

    private boolean checkToClear(String input) {
        boolean internalClear = false;
        if(input.equals("history")) {
            internalClear = true;
            showHistory = true;
        } else if(input.equals("clear")) {
            internalClear = true;
        }
        return internalClear;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
}