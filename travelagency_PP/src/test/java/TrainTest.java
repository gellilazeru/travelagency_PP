import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrainTest {

    Train train;

    @BeforeEach
    public void setUp(){
        train = new Train (30, 150);
    }

    @Test
    public void canGetPrice(){
        assertThat(train.getPrice()).isEqualTo(130);
    }



}
