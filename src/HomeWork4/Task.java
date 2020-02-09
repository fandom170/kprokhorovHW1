package HomeWork4;

public class Task {
    private String name;
    private Priority priority;
    private int duration;
    private Complexity complexity;

    public Task(String Name,
                Priority priority,
                Complexity complexity) {
        this.name = Name;
        this.priority = priority;
        this.complexity = complexity;

        if (complexity.equals(Complexity.DIFFICULT)) {
            this.duration = 4;
        } else if (complexity.equals(Complexity.MEDIUM)) {
            this.duration = 2;
        } else {
            this.duration = 1;
        }
    }

    public String getTaskName() {
        return name;
    }

    public String getTaskPriority() {
        return priority.toString();
    }

    public String getTaskComplexity() {
        return complexity.toString();
    }

    public int getTaskDuration() {
        return duration;
    }
}
