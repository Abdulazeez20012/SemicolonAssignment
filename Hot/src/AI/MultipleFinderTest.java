package AI;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class MultipleFinderTest {
    @Test
    public void TestThatCanFindMultiple(){
        MultipleFinder multipleFinder = new MultipleFinder();
        int[] input = {1,10,2};
        int[] expected = {2,4,6,8,10};
        assertArrayEquals(expected,multipleFinder.findMultiples(1,10,2));
    }
    @Test
    public void TestThatCanFindAnotherMultiple(){
        MultipleFinder multipleFinder = new MultipleFinder();
        int[] input = {1,6,2};
        int[] expected = {2,4,6};
        assertArrayEquals(expected,multipleFinder.findMultiples(1,6,2));
    }
    @Test
    public void TestCanMultiplyAnyNumberIn_C(){
        MultipleFinder multipleFinder = new MultipleFinder();
        int[] input = {1,12,3};
        int[] expected ={3,6,9,12};
        assertArrayEquals(expected, multipleFinder.findMultiples(1,12,3));

    }

    @Test
    public void TestThatIfNegativeIsAmongTheListItShouldBeNotEquals(){
        MultipleFinder multipleFinder= new MultipleFinder();
        int[] input = {1,-12,-1};
        int[] expected = {3,6,9,12};
        assertNotEquals(expected,multipleFinder.findMultiples(1,-12,-1));
    }

}
