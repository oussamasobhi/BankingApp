package ArrayList_autoboxingunboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }
    public boolean newCustomer(String customername,double initialamount){
        if(findcustomer(customername)==null){
            this.customers.add(new Customer(customername,initialamount));
            return true;
        }
       else{
           return false;
        }
    }
    public boolean  addcustomertransaction(String customername,double amount){
        Customer existingcustomer=findcustomer(customername);
        if(existingcustomer!=null){
            existingcustomer.addtransaction(amount);
            return true;
        }
        else
            return false;
    }
    private Customer findcustomer(String name){
        for(int i=0;i<this.customers.size();i++){
            if(this.customers.get(i).getName()==name)
                return this.customers.get(i);
        }
        return null;
    }

}
