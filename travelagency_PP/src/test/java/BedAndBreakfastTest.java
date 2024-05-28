import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BedAndBreakfastTest {

    BedAndBreakfast bedAndBreakfast;
    Customer Zoe;

    @BeforeEach
    public void setUp(){
        bedAndBreakfast = new BedAndBreakfast(20);
        Zoe = new Customer("Zoe");
    }

    @Test
    public void canGetPrice(){
        assertThat(bedAndBreakfast.getPrice()).isEqualTo(20);
    }

    @Test
    public void canGetCustomer(){
        bedAndBreakfast.setBookedCustomer(Zoe);
        String result = bedAndBreakfast.getCustomer().getCustomerName();
        assertThat(result).isEqualTo("Zoe");
    }

    @Test
    public void canSetPrice(){
        this.bedAndBreakfast.setPrice(32);
        assertThat(bedAndBreakfast.getPrice()).isEqualTo(32);
    }

    @Test
    public void canSetBookedCustomer(){
        this.bedAndBreakfast.setBookedCustomer(Zoe);
        assertThat(bedAndBreakfast.getCustomer().getCustomerName()).isEqualTo("Zoe");
    }

    @Test
    public void canBook(){
        bedAndBreakfast.book(Zoe);
        String result = bedAndBreakfast.getCustomer().getCustomerName();
        assertThat(result).isEqualTo("Zoe");
    }

//    @Test
//    public void canCancel(){
//        bedAndBreakfast.cancel(Zoe);
//        String result = bedAndBreakfast.getCustomer().getCustomerName();
//        assertThat(result).isEmpty();
//    }


}
