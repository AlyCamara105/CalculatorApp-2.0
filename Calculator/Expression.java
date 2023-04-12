package Calculator;

public class Expression {
    private double result;

    public Expression() {
        
    }

    public void printResult() {
        System.out.println(result);
    }

    private void setResult(double result) {
        this.result = result;
    }
}