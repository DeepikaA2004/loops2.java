import java.util.*;
import java.io.*;

import java.util.Scanner;

public class LoopsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int currentValue = a;
            for (int i = 0; i < n; i++) {
                currentValue += (int) Math.pow(2, i) * b;
                System.out.print(currentValue + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}