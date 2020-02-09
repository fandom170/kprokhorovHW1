package HomeWork4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataValidation {
    Scanner sc = new Scanner(System.in);

    public static int taskCalc(int total, int taskCounter, int hours) {
        int taskNo = 0;
        if (total < taskCounter * hours) {
            try {
                taskNo = total / hours;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        } else {
            taskNo = taskCounter;
        }
        return taskNo;
    }

    public List<Task> taskEntering() {
        String taskName;
        String priority;
        String complexity;
        Task newTask = null;
        List<Task> tasks = new ArrayList<Task>();

        while (true) {
            Priority taskPriority;
            Complexity taskComplexity;
            System.out.println("Please enter task name.");
            taskName = dataReceiving("Task name");
            if (taskName.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.println("Enter task priority, please. Task priority should be H(\"High\") , M(\"Medium\") or L(\"Low\").");
            priority = dataReceiving("Priority").toUpperCase();
            if (priority.equals("STOP")) {
                break;
            }
            if (priority.equals("H")) {
                taskPriority = Priority.HIGH;
            } else if (priority.equals("M")) {
                taskPriority = Priority.MEDIUM;
            } else if (priority.equals("L")) {
                taskPriority = Priority.LOW;
            } else {
                System.out.println("Incorrect value of task priority was selected.\n Please enter data again");
                continue;
            }

            System.out.println("Enter task complexity, please. Task complexity should be \"Difficult\"  (D), \"Medium\"  (M) or \"Easy\" (E).");
            complexity = dataReceiving("Complexity").toUpperCase();
            if (complexity.equals("STOP")) {
                break;
            }

            if (complexity.equals("D")) {
                taskComplexity = Complexity.DIFFICULT;
            } else if (complexity.equals("M")) {
                taskComplexity = Complexity.MEDIUM;
            } else if (complexity.equals("E")) {
                taskComplexity = Complexity.EASY;
            } else {
                System.out.println("Incorrect value of task complexity was selected.\n Please enter data again");
                continue;
            }
            newTask = new Task(taskName, taskPriority, taskComplexity);
            tasks.add(newTask);
        }
        return tasks;
    }

    public int totalTime(List<Task> taskList) {
        int totalTime = 0;
        for (Task entry : taskList) {
            totalTime += entry.getTaskDuration();
        }

        return totalTime;
    }

    public void printAmountOfTasksWithPriority(List<Task> taskList) {
        String priority = "";
        String extra = sc.nextLine();
        extra = extra.trim().toLowerCase();
        boolean loopBreak = false;
        int counter = 0;
        if (extra.equals("y")) {
            System.out.println("Please choose desired priority. If you want to skip, enter any value except priority. \n" +
                    "Available priority values are \"H \"(High), \"M\" (Medium and \"L\"(Low).");
            priority = sc.nextLine();
            priority = priority.trim().toLowerCase();

        } else {
            System.out.println("Work of program is completed. See you later.");
            System.exit(0);
        }

        if (priority.equals("h") || priority.equals("m") || priority.equals("l")) {
            if (priority.equals("h")) {
                priority = "HIGH";
            } else if (priority.equals("m")) {
                priority = "MEDIUM";
            } else {
                priority = "LOW";
            }

            for (Task entry : taskList) {
                if (entry.getTaskPriority().equals(priority)) {
                    System.out.printf("Task name is \"%s\"\n", entry.getTaskName());
                    counter++;
                }
            }

            System.out.printf("Total amount of %s priority tasks is %d \n", priority, counter);
        } else {
            System.out.println("Incorrect value was entered. Block is skipped.");
        }
    }


    public void daysAmountCalculation(List<Task> taskList) {
        String days = sc.nextLine();
        int hours = 0;
        try {
            hours = Integer.parseInt(days) * 24;
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            System.out.println("Incorrect value was entered. Program will finish work");
            System.exit(0);
        }
        taskCheck(hours, taskList);
    }

    public void taskCheck(int hours, List<Task> taskList) {
        String returnString = "";
        int rest;
        int highCounter = 0, medCounter = 0, lowCounter = 0;

        //counting of amount of tasks for each complexity
        for (Task entry : taskList) {
            switch (entry.getTaskComplexity()) {
                case "DIFFICULT":
                    highCounter++;
                case "MEDIUM":
                    medCounter++;
                default:
                    lowCounter++;
            }
        }

        if (hours <= 0) {
            returnString = "No tasks are possible to execute";
        } else if (highCounter * 4 + medCounter * 2 + lowCounter <= hours) {
            returnString = "All tasks can be done in entered period";
        } else {
            rest = taskCalc(hours, highCounter, 4);
            returnString = "Desired period allows to execute " + rest + "tasks with \"High\" priority " +
                    "(from" + highCounter + "according to schedule)";
            hours -= highCounter * 4;

            rest = taskCalc(hours, medCounter, 2);
            returnString += ",\n " + rest + "tasks with \"Medium\" priority (from" + medCounter + "according to scgedule)";

            hours -= medCounter * 2;
            returnString += " and " + hours + " tasks with \"Low\" priority";
        }
        System.out.println(returnString);
    }

    public String dataReceiving(String data) {
        System.out.printf("Enter STOP or \"S\" instead of %s to stop entering of data.\n", data);
        String dataRow = "stop";
        for (int i = 0; i < 3; i++) {
            dataRow = sc.nextLine();
            dataRow = dataRow.trim();
            String dataRowMarker = dataRow.toLowerCase();
            if (dataRowMarker.equals("stop") || dataRowMarker.equals("s")) {
                return "stop";
            }
            if (dataRow.isEmpty() && i < 2) {
                System.out.println("Invalid data was entered. \n Please try again");
            } else if (dataRow.isEmpty() && i == 2) {
                System.out.println("You made to many mistakes during the task entering.");
                System.out.println("Work of program will be terminated.");
                System.exit(-1);
            }
            break;
        }
        return dataRow;

    }
}



