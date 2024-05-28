import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Faith");

    }

    @Test
    public void canGetName (){
        assertThat(customer.getCustomerName()).isEqualTo("Faith");
    }

    @Test
    public void canGetWallet (){
        assertThat(customer.getWallet()).isEqualTo(100);
    }

    @Test
    public void canSetName(){
        this.customer.setName("Gellila");
        assertThat(customer.getCustomerName()).isEqualTo("Gellila");
    }

    @Test
    public void canSetWallet(){
        this.customer.setWallet(50);
        assertThat(customer.getWallet()).isEqualTo(50);
    }

    @Test
    public void canCheckIfCanAfford(){
        assertThat(customer.checkIfCanAfford(67)).isEqualTo(true);

    }

    @Test
    public void canPay(){
        customer.pay(60);
        int result = customer.getWallet();
        assertThat(result).isEqualTo(40);
    }

}
