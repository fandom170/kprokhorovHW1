package HomeWork2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean enter = true;
        int startPoint = 0, endPoint = 0;
        int sum = 0;
        while (enter) {
            System.out.println("Enter start of diapason, please");
            String start = sc.nextLine();
            System.out.println("Enter end of diapason, please (not included)");
            String end = sc.nextLine();

            startPoint  =Integer.parseInt(start);
            endPoint  =Integer.parseInt(end);

            if (endPoint - startPoint < 10) {
                System.out.println("Value of diapason is not large enough");
                continue;
            }

            enter = false;
        }

        int [] arr = new int [endPoint - startPoint];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = startPoint + i;
            if (arr[i]%3 == 0 && arr[i]%5 != 0) {
                sum += arr[i];
            }
        }

        System.out.printf("Total is %d", sum);


    }
}
