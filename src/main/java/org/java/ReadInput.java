package org.java;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(String.valueOf(+ 1));
        int lineNumber = 1;
        while (scanner.hasNextLine()) {
            System.out.println(lineNumber + " " + scanner.nextLine());
            lineNumber++;
        }
        scanner.close();
    }
}
