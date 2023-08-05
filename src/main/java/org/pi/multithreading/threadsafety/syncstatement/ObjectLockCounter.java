package org.pi.multithreading.threadsafety.syncstatement;

public class ObjectLockCounter {
    private int counter = 0;
    private final Object object = new Object();

    public void incrementCounter() {
        synchronized(object) {
            counter += 1;
        }
    }

    public int getCounter() {
        return counter;
    }
}

/*
We can slightly improve the thread-safe implementation of the SyncCounter class
by exploiting another object as a monitor lock, instead of this.

Not only does this provide coordinated access to a shared resource in a multithreaded environment,
but it also uses an external entity to enforce exclusive access to the resource as shown above

We use a plain Object instance to enforce mutual exclusion.
This implementation is slightly better, as it promotes security at the lock level.

When using this for intrinsic locking, an attacker could cause a deadlock by acquiring the intrinsic lock and triggering
 a denial of service (DoS) condition.
 */