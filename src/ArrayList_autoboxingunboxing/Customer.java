package ArrayList_autoboxingunboxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialamount) {
        this.name = name;
        this.transactions=new ArrayList<Double>();
        addtransaction(initialamount);
    }
    public void addtransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
