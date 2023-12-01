/*
 * Copyright (c) 2023 Network International.
 * The copyright notice above does not evidence any
 * actual or intended publication of such source code.
 */
 
package org.pi.designpatterns.simplefactory;
public class WheelFactory {
    public static Wheel makeWheel(float v) {
        return new CarWheel(v);
    }
}
