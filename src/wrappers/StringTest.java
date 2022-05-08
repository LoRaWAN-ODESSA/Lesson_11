package wrappers;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        // TASK 2
        String string1 = "Russian";
        String string2 = new String("warship");
        char[] data = {'g', 'o'};
        String string3 = new String(data);
        String newString = "fuck";
        String string4 = new String(newString.getBytes(StandardCharsets.UTF_8));
        StringBuilder builder = new StringBuilder("yourself");
        String string5 = builder.toString();

        // TASK 3
        System.out.println("TASK 3:");
        String str1 = "Orange.Apple.Pomegranate.Pear";
        printLongestFruit(str1);
        printThreeLetters(str1);

        String str2 = "   I_am_new_string      ";
        printEditedString(str2);

        System.out.println("\nProgram:");
        runProgram();

        // TASK 4
        System.out.println("\nTASK 4:");
        String[] arrayString = {string1, string2, string3, string4, string5};
        StringBuilder newBuilder = setBuilder(arrayString);
        printByThree(newBuilder);
        printVersa(newBuilder);
        printBuilder(newBuilder);
    }

    public static void printLongestFruit(String string) {
        String[] arrayStr1 = string.split("\\.");
        String longestStr = "";
        for (String str : arrayStr1) {
            if(str.length() > longestStr.length()) {
                longestStr = str;
            }
        }
        System.out.println("The longest fruit name is: " + longestStr.toLowerCase());
    }

    public static void printThreeLetters(String string) {
        String[] arrayStr1 = string.split("\\.");
        String longestStr = "";
        for (String str : arrayStr1) {
            if(str.length() > longestStr.length()) {
                longestStr = str;
            }
        }
        String first3 = longestStr.substring(0, 3).toLowerCase();
        System.out.println("The first 3 letters of the longest fruit name is: " + first3);
    }

    public static void printEditedString(String string) {
        String newString = string.trim().replace("_", " ");
        System.out.println("The string after editing is: " + newString);
    }
    public static void runProgram() {
        boolean isWorking = true;
        while (isWorking) {
            Scanner textIn = new Scanner(System.in);
            System.out.print("Input a text: ");
            String text = textIn.next();
            System.out.println("You have entered: " + text);
            switch (text.toLowerCase().trim()) {
                case "start":
                    System.out.println("Start the process...");
                    break;
                case "end":
                    System.out.println("Process completed.");
                    isWorking = false;
                    break;
                case "error":
                    System.out.println("Program error!");
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
    public static StringBuilder setBuilder(String[] arrayString) {
        StringBuilder newBuilder = new StringBuilder();
        for (int i = 0; i < arrayString.length; i++) {
            if(i == (arrayString.length - 1)){
                newBuilder.append(arrayString[i]);
            } else {
                newBuilder.append(arrayString[i]);
                newBuilder.append(" ");
            }
        }
        return newBuilder;
    }
    public static void printByThree(StringBuilder newBuilder) {
        System.out.println("Print by 3:");
        String[] newSplit = newBuilder.toString().split(" ");
        for (int i = 0; i < newSplit.length; i++) {
            if (i == 0) {
                System.out.print(newSplit[i] + " ");
            } else if((i % 3) != 0) {
                System.out.print(newSplit[i] + " ");
            } else {
                System.out.print("\n" + newSplit[i] + " ");
            }
        }
    }

    public static void printVersa(StringBuilder newBuilder) {
        System.out.println("\nPrint versa:");
        String[] newSplit = newBuilder.toString().split(" ");
        for (int i = 0; i < newSplit.length; i++) {
            System.out.print(newSplit[newSplit.length - 1 - i] + " ");
        }
    }

    public static void printBuilder(StringBuilder newBuilder) {
        System.out.println("\nPrint builder:");
        System.out.println(newBuilder);
    }
}
