import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    public void testMultiplication() {
        //given
        Dollar five = new Dollar(5);
        //when
        //then
        assertEquals(new Dollar(10), five.times(2));
        //when2
        //then2
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        // given
        Dollar five1 = new Dollar(5);
        Dollar five2 = new Dollar(5);
        Dollar six = new Dollar(6);

        // when

        // then
        assertTrue(five1.equals(five2));
        assertFalse(five1.equals(six));
    }

}