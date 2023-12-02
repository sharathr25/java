package org.pi.llds.snakeandladder.utils;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();
    public static int getRandomNum(int lowerBound, int upperBound) {
        return RANDOM.nextInt((upperBound - lowerBound) + 1) + lowerBound;
    }
}
