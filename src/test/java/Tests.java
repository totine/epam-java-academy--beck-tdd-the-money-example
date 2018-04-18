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
        Franc five = new Franc(5);
        //when
        //then
        assertEquals(new Franc(10), five.times(2));
        //when2
        //then2
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
        // then
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
        assertFalse(new Franc(5).equals(new Dollar(5)));
    }

}