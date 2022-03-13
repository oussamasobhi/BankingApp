package ArrayList_autoboxingunboxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches=new ArrayList<Branch>();
    }
    public boolean addbranch(String branchname){
        if(findbranch(branchname)==null){
            this.branches.add(new Branch(branchname));
           return true;
        }
        return false;
    }
    public boolean addcustomer(String branchname,String customername,double initialamount){
        Branch branch=findbranch(branchname);
        if(branch!=null){
            return branch.newCustomer(customername,initialamount);
        }
        return false;
    }
     public boolean addcusttrans(String branchname,String customername,double amount){
        Branch branch=findbranch(branchname);
        if(branch!= null){
            return branch.addcustomertransaction(customername,amount);

        }
        return false;
     }

    private Branch findbranch(String branchname){
        for(int i=0;i<this.branches.size();i++){
            if(this.branches.get(i).getName()==branchname)
                return this.branches.get(i);
        }
        return null;
    }

    public boolean listcustomers(String branchname,boolean Showtrans){
        Branch branch=findbranch(branchname);
        if(branch!=null){
            System.out.println("customers for branch "+branch.getName());
            ArrayList<Customer> customerslist=branch.getCustomers();
            for(int i=0;i<customerslist.size();i++){
                System.out.println("customer: "+customerslist.get(i).getName()+"["+(i+1)+"]");
                if(Showtrans){
                    System.out.println("transactions");
                    ArrayList<Double> transactions=customerslist.get(i).getTransactions();
                    for(int j=0;j<transactions.size();j++){
                        System.out.println("["+(j+1)+"]  amount" +transactions.get(j));
                    }
                }
            }
            return true;
        }else
            return false;
    }


















}
