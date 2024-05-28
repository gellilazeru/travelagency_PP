import java.awt.print.Book;

public class BedAndBreakfast implements Bookable {

    private int price;
    private Customer customer;

    public BedAndBreakfast (int price){
        this.price = price;
        this.customer = null;
    }

    // GETTERS
    @Override
    public int getPrice(){
        return this.price;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    // SETTERS
    public void setPrice(int price){
        this.price = price;
    }

    public void setBookedCustomer(Customer customer){
        this.customer = customer;
    }

    // METHODS

    // can't make booking if customer cannot afford (refer to customer class)
    // & or no capacity (if bookable = false)
    // add 1 capacity to the total and customer can afford.


    public void book(Customer customer) {
        if (hasCapacity() && customer.checkIfCanAfford(price)) {
            this.customer = customer;
        }
    }

    @Override
    public void cancel(Customer customer) {
        if (this.customer.equals(customer)) {
             this.customer = null;
        }
    }

    @Override
    public boolean hasCapacity() {
        return this.customer == null;
    }
}

