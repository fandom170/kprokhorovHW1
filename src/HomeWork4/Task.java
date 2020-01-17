package HomeWork4;

public class Task {
    private String name;
    private String priority;
    private int duration;

    public Task(String Name, String priority) {
        this.name = Name;
        this.priority = priority;

        if (priority.equals("high")) {
            this.duration = 4;
        } else if (priority.equals("medium")) {
            this.duration = 2;
        } else {
            this.duration = 1;
        }
    }

    public String getTaskName() {
        return name;
    }

    public String getTaskPriority() {
        return priority;
    }

    public int getTaskDuration() {
        return duration;
    }
}
