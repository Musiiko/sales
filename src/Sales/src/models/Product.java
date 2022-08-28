package Sales.src.models;

import Sales.src.base.Fiscal;
import Sales.src.base.Income;

public class Product implements Income, Fiscal {

    private String name;
    private int quantity;
    private double price;

    protected double profit;
    protected double tax;
    protected double netIncome;

    final double taxRate = 5.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getProfit() {
        return profit;
    }

    public double getTax() {
        return tax;
    }

    public double getNetIncome() {
        return netIncome;
    }

    @Override
    public void IncomeTaxCalculation() {
        tax = profit / 100 * taxRate;
    }

    @Override
    public void IncomeCalculations() {
        profit = quantity * price;
    }

    @Override
    public void NetIncomeCalculation() {
        netIncome = profit - tax;
    }

}
