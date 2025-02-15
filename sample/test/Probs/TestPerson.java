package Probs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTest {

    @Test
    void testAddProblem() {
        Person person = new Person("Victim");
        Problem problem = new Problem("Debt", "FINANCIAL");


        person.addProblem(problem);
        person.addProblem2(problem);
        person.addProblem3(problem);

        assertEquals(3, person.getUnsolvedProblems().size());
    }

    @Test
    void testSolveProblem() {
        Person person = new Person("Victim");
        Problem problem = new Problem("Debt", "FINANCIAL");

        person.addProblem(problem);
        person.solveProblem(problem);

        assertTrue(problem.isSolved());
        assertEquals(0, person.getUnsolvedProblems().size());
    }

    @Test
    void testGetUnsolvedProblems() {
        Person person = new Person("Victim");
        Problem problem1 = new Problem("Debt", "FINANCIAL");
        Problem problem2 = new Problem("Lack of motivation", "SPIRITUAL");

        person.addProblem(problem1);
        person.addProblem(problem2);
        person.solveProblem(problem1);

        List<Problem> unsolvedProblems = person.getUnsolvedProblems();

        assertEquals(1, unsolvedProblems.size());
        assertEquals("Lack of motivation", unsolvedProblems.getFirst().getName());
    }
    }


