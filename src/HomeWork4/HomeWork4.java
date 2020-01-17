package HomeWork4;

import java.util.List;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DataValidation dataValidation = new DataValidation();
        List taskList = dataValidation.taskEntering();

        System.out.printf("Total time for all task execution is %d \n", dataValidation.totalTime(taskList));
        System.out.println("Do you need extra data? Y/N");
        System.out.println("Please enter desired priority to see list of appropriate tasks");

        dataValidation.printAmountOfTasksWithPriority(taskList);

        System.out.println("Please enter desired amount of days for task execution");
        System.out.println("If you want to skip, enter any value except integer number of days");

        dataValidation.daysAmountCalculation(taskList);

        sc.close();
    }



}
