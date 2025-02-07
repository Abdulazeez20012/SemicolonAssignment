import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProblem {
    @Test
    public void testToCheckIfThereIsAProblem() {
        String name = "testProblem";
        String description = "testDescription";
        boolean  isSolved = true;
        Problem problem = new Problem (name,description,isSolved);
        assertTrue(problem.thereIsProblem());


    }
    @Test
    public void testToCheckIfThereIsANonProblem() {
        String name = "testProblem";
        String description = "testDescription";
        boolean  isSolved = false;
        Problem problem = new Problem (name,description,isSolved);
        assertFalse(problem.thereIsNoProblem());
    }

    @Test
    public void testToCanAddProblem() {
        String name = "testProblem";
        String description = "testDescription";
        boolean  isSolved = true;
        Problem problem = new Problem (name,description,isSolved);
        assertTrue(problem.thereIsProblem());
        problem.addToProblem();
        
    }

}
