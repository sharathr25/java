package org.pi.algorithms.leetcode.medium;

import junit.framework.TestCase;

import java.util.Arrays;

public class GrayCodeTest extends TestCase {
    public void testGetGrayCode1() {
        GrayCode grayCode = new GrayCode();
        assertEquals(Arrays.asList(0, 1, 3, 2), grayCode.get(2));
    }

    public void testGetGrayCode2() {
        GrayCode grayCode = new GrayCode();
        assertEquals(Arrays.asList(0, 1), grayCode.get(1));
    }

    public void testGetGrayCode3() {
        GrayCode grayCode = new GrayCode();
        System.out.println(Integer.toString(8, 2));
        System.out.println(Integer.toString(9, 2));
        assertEquals(Arrays.asList(0, 1, 2, 3), grayCode.get(5));

    }

}