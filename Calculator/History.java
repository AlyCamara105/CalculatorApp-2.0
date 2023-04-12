package Calculator;

public class History {
    public static String history = "\nHistory:\n";

    public static void addHistory(String historyToAdd) {
        history += historyToAdd;
    }

    public static void showHistory() {
        if(history.equals("\nHistory:\n")) {
            System.out.println("No History.");
        } else {
            System.out.println(history);
        }
    }
}
