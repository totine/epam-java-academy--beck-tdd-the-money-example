import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    public void testMultiplication() {
        //given
        Dollar five = new Dollar(5);

        //when
        five.times(2);

        //then
        assertEquals(10, five.amount);
    }

}