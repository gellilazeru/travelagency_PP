public class Customer {

    private String name;
    private int wallet;

    public Customer (String name){
        this.name = name;
        this.wallet = 100;
    }

    // GETTERS

    public String getName(){
        return this.name;
    }

    public int getWallet(){
        return this.wallet;
    }

    // SETTERS

    public void setName(String name){
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
