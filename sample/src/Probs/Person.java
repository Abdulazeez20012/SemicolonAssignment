package Probs;

import java.util.ArrayList;
import java.util.List;


public class Person {
    private String name;
    private List<Problem> problems;

    public Person(String name) {
        this.name = name;
        this.problems = new ArrayList<>();
    }

    public Person() {

    }

    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    public void solveProblem(Problem problem) {
        problem.solve();
    }

    public List<Problem> getUnsolvedProblems() {
        List<Problem> unsolvedProblems = new ArrayList<>();
        for (Problem problem : problems) {
            if (!problem.isSolved()) {
                unsolvedProblems.add(problem);
            }
        }
        return unsolvedProblems;
    }

    public void addProblem2(Problem problem) {
        problems.add(problem);
    }

    public void addProblem3(Problem problem) {
        problems.add(problem);
    }
}
