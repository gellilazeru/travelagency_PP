import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public abstract class Train implements Bookable {

    private int price;
    private int capacity;
    public ArrayList<Customer> collection;

    public Train(int price, int capacity){
        this.price = price;
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    // GETTERS
    @Override
    public int getPrice(){
        return this.price;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public ArrayList<Customer> getCollection(){
        return this.collection;
    }

    // SETTERS
    public void setPrice(int price){
        this.price = price;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setCollection(ArrayList<Customer> collection){
        this.collection = collection;
    }



     //METHODS

    //can't make booking if customer cannot afford (refer to customer class)
    // & or no capacity (if bookable = false)

    public void book(Customer customer) {
        if (hasCapacity() && customer.checkIfCanAfford(price)) {
            collection.add(customer);
        }
    }

    @Override
    public void cancel(Customer customer) {
        collection.remove(customer);
        }
    }

//    @Override
//    public boolean hasCapacity(){
//    return collection
//    }

// }

// Struggling to understand array list and collection. Ask about this.


