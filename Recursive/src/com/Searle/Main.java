package com.Searle;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(exponentiation(5,2));
        System.out.println(fibonacci(5));
        towerOfHanoi(3,1,3,2);
    }

    public static int factorial(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int pre = n - 1;
        return n * factorial(pre);
    }

    public static int exponentiation(int n, int e) {
        int ep = 0;
        int r = 0;

        if(e == 0) return 1;
        if(e == 1) return n;

        if(e % 2 == 0) {ep = e/2;}
        if(e % 2 == 1) {ep = (e-1)/2;}

        int rp = exponentiation(n, ep);

        if(e % 2 == 0) {r = rp * rp;}
        if(e % 2 == 1) {r = n * rp * rp;}

        return r;
    }

    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int r = fibonacci(n-1) + fibonacci(n-2);
        return r;
    }

    public static int towerOfHanoi(int n, int s, int d, int aux) {
        if(n == 1) {
            System.out.println("Move disc " + n + " from tower " + s + " to tower " + d);
            return 0;
        }

        towerOfHanoi(n-1, s, aux, d);
        System.out.println("Move disc " + n + " from tower " + s + " to tower " + d);
        towerOfHanoi(n-1, aux, d, s);
        return 0;
    }
}
