package SF;

import org.junit.Test;
import static org.junit.Assert.*;

public class SevenSegmentDisplayTest {

    @Test
    public void TestForSegment_0_And_Display_The_ZeroWithHarshPattern() {
        char[][] expected = {
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', ' ', ' ', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };
        char[][] actual = SevenSegmentDisplay.getSevenSegmentDisplay(0);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestForSegment_1_And_Display_The_OneWithHarshPattern() {
        char[][] expected = {
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', '#'},
                {' ', ' ', ' ', '#'},
                {' ', ' ', ' ', '#'},
                {' ', ' ', ' ', '#'}
        };
        char[][] actual = SevenSegmentDisplay.getSevenSegmentDisplay(1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestForSegment_2_And_Display_The_TwoWithHarshPattern() {
        char[][] expected = {
                {'#', '#', '#', '#'},
                {' ', ' ', ' ', '#'},
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', ' '},
                {'#', '#', '#', '#'}
        };
        char[][] actual = SevenSegmentDisplay.getSevenSegmentDisplay(2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestForSegment_3_And_Display_The_ThreeWithHarshPattern() {
        char[][] expected = {
                {'#', '#', '#', '#'},
                {' ', ' ', ' ', '#'},
                {'#', '#', '#', '#'},
                {' ', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };
        char[][] actual = SevenSegmentDisplay.getSevenSegmentDisplay(3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestForSegment_4_And_Display_The_FourWithHarshPattern() {
        char[][] expected = {
                {' ', ' ', ' ', ' '},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'},
                {' ', ' ', ' ', '#'},
                {' ', ' ', ' ', ' '}
        };
        char[][] actual = SevenSegmentDisplay.getSevenSegmentDisplay(4);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestForSegment_5_And_Display_The_FiveWithHarshPattern() {
        char[][] expected = {
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', ' '},
                {'#', '#', '#', '#'},
                {' ', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };
        char[][] actual = SevenSegmentDisplay.getSevenSegmentDisplay(5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestForSegment_6_And_Display_The_SixWithHarshPattern() {
        char[][] expected = {
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', ' '},
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };
        char[][] actual = SevenSegmentDisplay.getSevenSegmentDisplay(6);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestForSegment_7_And_Display_The_SevenWithHarshPattern() {
        char[][] expected = {
                {'#', '#', '#', '#'},
                {' ', ' ', ' ', '#'},
                {' ', ' ', ' ', '#'},
                {' ', ' ', ' ', '#'},
                {' ', ' ', ' ', '#'}
        };
        char[][] actual = SevenSegmentDisplay.getSevenSegmentDisplay(7);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestForSegment_8_And_Display_The_EightWithHarshPattern() {
        char[][] expected = {
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };
        char[][] actual = SevenSegmentDisplay.getSevenSegmentDisplay(8);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestForSegment_9_And_Display_The_NineWithHarshPattern() {
        char[][] expected = {
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'},
                {' ', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };
        char[][] actual = SevenSegmentDisplay.getSevenSegmentDisplay(9);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestForAllDigit_And_Display_The_AllDigitWithHarshPattern() {
        for (int i = 0; i <= 9; i++) {
            assertNotNull("Valid digits should return non-null", SevenSegmentDisplay.getSevenSegmentDisplay(i));
        }
    }

    @Test
    public void TestThatIfNegativeDigitAreInputed_Eg_MinusDigit_ReturnNull() {
        assertNull("Negative numbers should return null", SevenSegmentDisplay.getSevenSegmentDisplay(-1));
    }

    @Test
    public void TestThatLargeInvalidInputOrDigitGreaterThanNineShouldReturnNullAlso() {
        assertNull("Numbers greater than 9 should return null", SevenSegmentDisplay.getSevenSegmentDisplay(10));
    }
}
