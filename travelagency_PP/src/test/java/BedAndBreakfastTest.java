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

}
