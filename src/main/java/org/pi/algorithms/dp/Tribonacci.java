package org.pi.algorithms.dp;

import java.util.HashMap;
import java.util.Map;

public class Tribonacci {
    private static int trib(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return trib(n, memo);
    }

    private static int trib(int n, Map<Integer, Integer> memo) {
        if (n == 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (memo.containsKey(n)) return memo.get(n);

        int res = trib(n - 1, memo) + trib(n - 2, memo) + trib(n - 3, memo);
        memo.put(n, res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(trib(30));
    }
}
