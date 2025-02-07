public class Problem {
    private String name;
    private String description;
    private boolean isSolved;

    public Problem(String name, String description, boolean isSolved) {
        this.name = name;
        this.description = description;
        this.isSolved = isSolved;
    }


    public boolean thereIsProblem() {
        return true;
    }

    public void isSolved() {
        this.isSolved = true;
    }

    public boolean thereIsNoProblem() {
        return false;
    }

    public void addToProblem() {
        if (thereIsProblem()) {

        }
    }
}

