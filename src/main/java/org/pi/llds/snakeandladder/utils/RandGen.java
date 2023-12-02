package org.pi.llds.snakeandladder.utils;

import java.util.HashSet;
import java.util.Set;

public class RandGen {
    private final Set<Integer> toAvoid;

    public RandGen() {
        toAvoid = new HashSet<>();
    }

    public int getRandNum(int start, int end) {
        int rand;
        do {
            rand = Utils.getRandomNum(start, end);
        } while (toAvoid.contains(rand));
        toAvoid.add(rand);
        return rand;
    }
}
