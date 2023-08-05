package org.pi.multithreading.threadsafety.threadlocalinstance;

public class ThreadState {
    public static final ThreadLocal<StateHolder> statePerThread =
            ThreadLocal.withInitial(() -> new StateHolder("INITIAL STATE"));

    public static String getState() {
        return statePerThread.get().getState();
    }
}
