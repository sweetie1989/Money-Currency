import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-18
 * Time: 下午2:29
 * To change this template use File | Settings | File Templates.
 */
public class NumberTest {
    @Test
    public void dollarMultiplicationTest () {
        //given
        Money five = Money.dollar(5);
        //then
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
    }

    @Test
    public void FrancMultiplicationTest () {
        //given
        Money five = Money.franc(5);
        //then
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15),five.times(3));
}

    @Test
    public void equalityTest () {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

}
