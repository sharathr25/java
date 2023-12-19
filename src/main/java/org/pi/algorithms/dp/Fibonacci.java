package org.pi.algorithms.dp;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static int fib(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) return n;
        if (memo.containsKey(n)) return memo.get(n);

        int res = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, res);

        return res;
    }

    private static int fib(int n) {
        return fib(n, new HashMap<>());
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fib(46));
    }
}
