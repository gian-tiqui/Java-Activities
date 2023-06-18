package problems;

import java.util.ArrayList;

public class Fibonacci {

    ArrayList<Integer> fibonacciNumbers;
    public Fibonacci(int amount) {

        ArrayList<Integer> fibs = new ArrayList<>();
        int n = 1, n2 = 1, temp = 0;

        for (int i = 0; i < amount; ++i) {
            fibs.add(n);

            temp = n;
            n = n2;
            n2 = temp + n;
        }

        this.fibonacciNumbers = fibs;
    }

    public ArrayList<Integer> getFibonacciNumbers() {
        return fibonacciNumbers;
    }

    public void printFibNums() {
        for (int i : fibonacciNumbers) System.out.print(i + " ");
        System.out.println();
    }

    public int getNthFibNum(int n) {
        return this.fibonacciNumbers.get(n - 1);
    }

    public int getFibNumsSize() {
        return this.fibonacciNumbers.size();
    }

    public void updateFibNumsAmount(int newSize) {

        Fibonacci fibonacci = new Fibonacci(newSize);

        this.fibonacciNumbers = fibonacci.getFibonacciNumbers();
    }
}
