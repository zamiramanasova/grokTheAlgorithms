package org.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger possiblePrime = new BigInteger(n);
        boolean isPrime = possiblePrime.isProbablePrime(1);
        System.out.println("Простое ли число: " + isPrime);

        bufferedReader.close();
    }
}
