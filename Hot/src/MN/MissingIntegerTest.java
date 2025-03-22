package MN;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MissingIntegerTest {
    @Test
    public void TestForAnEmptyInputOfArray(){
        MissingInteger missingInteger = new MissingInteger();
        int[] input = {};
        int[] expectedOutput = {};
        assertArrayEquals(expectedOutput,missingInteger.findMissingInteger(input));
    }
    @Test
    public void TestThatCanFindMissingIntegerFromAnArray(){
        MissingInteger missingInteger = new MissingInteger();
        int[] input = {1,2,5};
        int[] expectedOutput = {3,4};
        assertArrayEquals(expectedOutput, missingInteger.findMissingInteger(input));
    }
    @Test
    public void TestThatCanFindMissingIntegerOf_77_78_80_FromAnArray_AndReturns_79(){
        MissingInteger missingInteger = new MissingInteger();
        int[] input = {77,78,80};
        int[] expectedOutput = {79};
        assertArrayEquals(expectedOutput,missingInteger.findMissingInteger(input));

    }
    @Test
    public void TestThatWhenNoMissingNumberFindFromAnArrayReturnAnEmptyArray(){
        MissingInteger missingInteger = new MissingInteger();
        int[] input = {77,78,79,80};
        int[] expectedOutput = {};
        assertArrayEquals(expectedOutput,missingInteger.findMissingInteger(input));
    }



}
