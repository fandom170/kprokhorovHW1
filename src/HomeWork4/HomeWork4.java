package HomeWork4;

import java.sql.SQLOutput;
import java.util.*;

public class HomeWork4 {
    public static void main(String[] args) {
        int total = 0;
        int hours = 0;
        String extra, priority = "", days = "";
        Scanner sc = new Scanner(System.in);
        int lowCounter = 0, medCounter = 0, highCounter = 0;

        Map <String, Integer> tasks = new HashMap<>();
        System.out.println("Entering of tasks started");


        while(true) {
            int execTime;
            System.out.println("enter STOP instead of task name to stop entering of tasks");
            System.out.println("Enter desired task name, please.");
            String taskName = sc.nextLine();
            if (taskName.equals("STOP")) {
                break;
            }
            System.out.println("Enter task priority, please");
            System.out.println("enter STOP instead of task priority to stop entering of tasks");
            String taskPriority = sc.nextLine();
            if (taskPriority.equals("STOP")) {
                break;
            }

            if (taskPriority.equals("High")) {
                execTime = 4;
                highCounter++;
            }
            else if (taskPriority.equals("Medium")) {
                execTime = 2;
                medCounter++;
            }
            else if (taskPriority.equals("Low")) {
                execTime = 1;
                lowCounter++;
            }
            else {
                System.out.println("Invalid data was entered, task has not been added");
                continue;
            }
            tasks.put(taskName, execTime);
        }

        for (String task: tasks.keySet()) {
            total += tasks.get(task);
        }

        System.out.printf("Total time for all task execution is %d", total);

        System.out.println("Do you need extra data? Y/N");
        extra = sc.nextLine();
        if (extra.equals("Y")) {
            System.out.println("Please desired priority. If you want to skip enter any value except priority");
            priority = sc.nextLine();
            System.out.println("Please enter desired amount of days for task execution");
            System.out.println("If you want to skip enter any value except integer number of days");
            days = sc.nextLine();
            sc.close();

        }

        if (priority.equals("High")||priority.equals("Medium")|| priority.equals("Low")){
            //or just use highCounter :)
            int counter = 0;
            for (String task: tasks.keySet()) {
                if (tasks.get(task).equals(priority)) {
                    counter++;
                };
            }
            System.out.printf("Total amount of %s priority tasks is %d", priority, counter);
        }

        try {
            hours = Integer.parseInt(days) * 24;
        }
        catch (NumberFormatException ex) {
                ex.printStackTrace();
        }

        if (hours > 0) {
            int highTask = 0, medTsk = 0, lowTask = 0;

            if (highCounter * 4 + medCounter * 2 + lowCounter * 1 <= hours) {
                System.out.println("All tasks can be done in entered period");
            }

            else {

            }

            }

        
    }


}
