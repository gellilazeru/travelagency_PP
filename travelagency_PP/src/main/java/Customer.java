public class Customer {

    private String name;
    private int wallet;

    public Customer (String customerName){
        this.name = customerName;
        this.wallet = 100;
    }

    // GETTERS

    public String getCustomerName(){
        return this.name;
    }

    public int getWallet(){
        return this.wallet;
    }

    // SETTERS

    public void setName(String customerName){
        this.name = name;
    }

    public void setWallet(int wallet){
        this.wallet = wallet;
    }

    // METHODS

    // to pay - there is an amount coming out of your wallet
    // check if they can afford

    public boolean checkIfCanAfford(int amount){
        if(this.wallet >= amount){
            return true;
        }
        else {
            return false;
        }
    }

    public void pay(int amount){
        this.wallet -= amount;
    }


}
