package swap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowersSwappingTest {
    FlowersSwapping flowersSwapping;

    @BeforeEach
    public void beforeEach() {
        flowersSwapping = new FlowersSwapping();
    }
    @Test
    public void TestThatFlowersSwappingForOneDayWorksCorrectly () {
        String actual = flowersSwapping.swap(1);
        String expected = "VGC";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatFlowersSwappingForSecondDayWorksCorrectly () {
        String actual = flowersSwapping.swap(2);
        String expected = "CVG";

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestThatFlowersSwappingForFourthDaysWorksCorrectly () {
        String actual = flowersSwapping.swap(4);
        String expected = "VGC";

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestThatFlowersSwappingForFivesDaysWorksCorrectly () {
        String actual = flowersSwapping.swap(5);
        String expected = "CVG";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatFlowersSwappingForSixthDaysWorksCorrectly () {
        String actual = flowersSwapping.swap(6);
        String expected = "GCV";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatFlowersSwappingForEighthDaysWorksCorrectly () {
        String actual = flowersSwapping.swap(8);
        String expected = "CVG";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatFlowersSwappingForTenDaysWorksCorrectly () {
        String actual = flowersSwapping.swap(10);
        String expected = "VGC";

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestThatFlowersSwappingForZeroDaysWorksCorrectly () {
        String actual = flowersSwapping.swap(0);
        String expected = "GCV";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestForMinusThrowsIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, ()
                -> flowersSwapping.swap(-1));
    }
}
