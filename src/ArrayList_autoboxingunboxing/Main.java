package ArrayList_autoboxingunboxing;

public class Main {

    public static void main(String[] args) {
	Bank bank1=new Bank("national bank");
        bank1.addbranch("alhouda");
        bank1.addcustomer("alhouda","oussama",1457.2);
        bank1.addcustomer("alhouda","ahmed",147.2);
        bank1.addcustomer("alhouda","fati",145.2);
        bank1.addbranch("essalam");
        bank1.addcustomer("essalam","aya",800.0);

        bank1.addcusttrans("alhouda","oussama",44.2);
        bank1.addcusttrans("alhouda","ahmed",20.2);
        bank1.addcusttrans("essalam","aya",30.2);

        bank1.listcustomers("alhouda",true);
    }
}
