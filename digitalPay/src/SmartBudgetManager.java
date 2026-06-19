import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

class SmartBudgetManager implements Serializable {
    private double budgetLimit;
    private Map<String, Double> expenses;

    public SmartBudgetManager(double budgetLimit) {
        this.budgetLimit = budgetLimit;
        this.expenses = new HashMap<>();
    }

    public void setBudgetLimit(double budgetLimit) {
        this.budgetLimit = budgetLimit;
    }

    public double getBudgetLimit() {
        return budgetLimit;
    }

    public Map<String, Double> getExpenses() {
        return expenses;
    }

    public void addExpense(String category, double amount) {
        expenses.put(category, expenses.getOrDefault(category, 0.0) + amount);
    }

    public boolean isOverBudget() {
        double totalExpenses = expenses.values().stream().mapToDouble(Double::doubleValue).sum();
        return totalExpenses > budgetLimit;
    }
}