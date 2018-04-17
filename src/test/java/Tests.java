import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    public void testMultiplication() {
        //given
        Dollar five = new Dollar(5);

        //when
        Dollar product = five.times(2);

        //then
        assertEquals(10, product.amount);

        //when2
        product = five.times(3);

        //then2
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality() {
        // given
        Dollar five1 = new Dollar(5);
        Dollar five2 = new Dollar(5);

        // when

        // then
        assertTrue(five1.equals(five2));
    }

}