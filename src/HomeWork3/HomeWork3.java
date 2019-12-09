package HomeWork3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder word = new StringBuilder();
        StringBuilder wordRev = new StringBuilder();
        String val = sc.nextLine();

        word.append(val);
        wordRev.append(val).reverse();

        if (word.toString().equals(wordRev.toString())) {
            System.out.println("Word is palindrome");
        }
        else {
            System.out.println("Word is not palindrome");
        }
    }
}
