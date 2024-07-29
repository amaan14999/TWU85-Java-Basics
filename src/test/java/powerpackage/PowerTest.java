package powerpackage;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PowerTest {
    @Test
    public void oneRaisedToOneIsOne() {
        Assert.assertEquals(1, PowerFinder.calculatePower(1, 1));
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        Assert.assertEquals(2, PowerFinder.calculatePower(2, 1));
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        Assert.assertEquals(4, PowerFinder.calculatePower(2, 2));
    }

    @Test
    public void threeRaisedToTwoIsNine() {
        Assert.assertEquals(9, PowerFinder.calculatePower(3, 2));
    }
}
