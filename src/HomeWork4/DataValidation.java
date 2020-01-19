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
        Task newTask = null;
        List<Task> tasks = new ArrayList<Task>();

        while (true) {
            System.out.println("enter STOP instead of task name to stop entering of tasks");
            System.out.println("Enter desired task name, please.");
            taskName = sc.nextLine();
            taskName = taskName.trim();
            if (taskName.equals("STOP")) {
                break;
            }

            System.out.println("Enter task priority, please. Task priority should be \"High\", \"Medium\" or \"Low\".");
            System.out.println("enter STOP instead of task priority to stop entering of tasks");
            priority = sc.nextLine();
            priority = priority.trim().toLowerCase();
            if (priority.equals("stop")) {
                break;
            }

            if (priority.equals("high") || priority.equals("medium") || priority.equals("low")) {
                newTask = new Task(taskName, priority);
            } else {
                System.out.println("Invalid data was entered, task has not been added");
                continue;
            }
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
        int counter = 0;
        if (extra.equals("y")) {
            System.out.println("Please choose desired priority. If you want to skip, enter any value except priority. \n" +
                    "Available priority values are \"High\", \"Medium\" and \"Low\".");
            priority = sc.nextLine();
            priority = priority.trim().toLowerCase();

        } else {
            System.out.println("Work of program is completed. See you later");
            System.exit(0);
        }

        if (priority.equals("high") || priority.equals("medium") || priority.equals("low")) {
            for (Task entry : taskList) {
                if (entry.getTaskPriority().equals(priority)) {
                    System.out.printf("Task name is \"%s\"\n", entry.getTaskName());
                    counter++;
                }
            }
            System.out.printf("Total amount of %s priority tasks is %d \n", priority, counter);

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

        //counting of amount of tasks for each priority
        for (Task entry : taskList) {
            switch (entry.getTaskPriority()) {
                case "High":
                    highCounter++;
                case "Medium":
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


}



