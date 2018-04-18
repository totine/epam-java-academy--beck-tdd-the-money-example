import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    public void testDollarMultiplication() {
        //given
        Money five = Money.dollar(5);
        //when
        //then
        assertEquals(Money.dollar(10), five.times(2));
        //when2
        //then2
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication() {
        //given
        Franc five = Money.franc(5);
        //when
        //then
        assertEquals(Money.franc(10), five.times(2));
        //when2
        //then2
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
        // then
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

}