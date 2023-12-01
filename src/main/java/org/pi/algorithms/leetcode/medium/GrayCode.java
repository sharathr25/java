package org.pi.algorithms.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrayCode {
    public List<Integer> get(int n) {
        List<Integer> result = new ArrayList<>();
        List<Integer> bit1With0s = new ArrayList<>();
        result.add(0);
        int i = 1;

        while (result.size() < Math.pow(2, n)) {
            int j = result.get(result.size() - 1);
            System.out.printf("%d,%d=%b%n", i,j,oneBitPosDiffer(i,j));
            if (oneBitPosDiffer(i, j)) {
//                if (j != 0 && oneBitPosDiffer(0, j)) bit1With0s.add(j);
                result.add(i);
            }
            i++;
        }

        System.out.println(result);
//        System.out.println(bit1With0s);

        return result;
    }

    static boolean isPowerOfTwo(int n){
        return n != 0 && ((n & (n-1)) == 0);
    }

    static boolean oneBitPosDiffer(int x, int y){
        return isPowerOfTwo(x ^ y);
    }
}
