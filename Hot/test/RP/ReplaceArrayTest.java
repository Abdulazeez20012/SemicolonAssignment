package RP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ReplaceArrayTest {
    @Test
    public void TestToConvertAllElement_X_inArray_To_1() {
        char[] inputArray = {'X','X','X','X','X','X','X','X' };
        int[] expectedArray = {1, 1, 1, 1, 1, 1, 1, 1};

        int[] resultArray = ReplaceArray.IntArray(inputArray);

        assertArrayEquals(expectedArray, resultArray);
    }
    @Test
    public void TestToConvertAllElement_O_inArray_To_0(){
        char[] inputArray = {'O','O','O','O','O','O','O','O' };
        int[] expectedArray = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] resultArray = ReplaceArray.IntArray(inputArray);
        assertArrayEquals(expectedArray, resultArray);

    }

    @Test
    public void TestToConvertCharElementInAnArrayToIntArray(){
        char[] inputArray = {'X','O','X','X','O','X','X','O' };
        int[] expectedArray = {1, 0, 1, 1, 0, 1, 1, 0};
        int[] resultArray = ReplaceArray.IntArray(inputArray);
        assertArrayEquals(expectedArray, resultArray);

    }
    @Test
    public void TestThatTheIntThatWeAreConvertingTheCharToIsNotEqual(){
        char[] inputArray = {'X','O','X','X','O','X','X','O' };
        int[] expectedArray = {1, 1, 1, 0, 1, 1, 1, 0};
        int[] resultArray = ReplaceArray.IntArray(inputArray);
        assertNotEquals(expectedArray, resultArray);
    }



}
