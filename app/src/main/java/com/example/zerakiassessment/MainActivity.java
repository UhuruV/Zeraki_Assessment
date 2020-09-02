package com.example.zerakiassessment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

package com.example.assessment;

import java.util.Scanner;


class MissingNumberInArray {
    public static void missingNumberInArray() {

        /* ###### A function that accepts input from a user ####*/

        Scanner source = new Scanner(System.in);
        System.out.print("Enter any number");
        String input;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            input=scanner.next().toLowerCase();
            int n = source.nextInt();
            int[] newNumber = new int[n];
            System.out.print("Enter any number- 1:");
            for (int i = 0; i <= n - 2; i++) {
                newNumber[i] = source.nextInt();
            }

            /* ####### ---Finding the missing number--- #####*/

            int sumOfAll = (n * (n + 2)) / 2;
            int sumOfArray = 0;
            for (int i = 0; i <= n - 2; i++) {
                sumOfArray = sumOfArray + newNumber[i];
            }
            int missingNumber = sumOfAll - sumOfArray;
            System.out.println(missingNumber);

            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}

