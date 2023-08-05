package org.pi.multithreading.threadsafety.immutable;

public class Main {
    static class MessageService {
        private final String msg;


        public MessageService(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }
    }

    public static void main(String[] args) {
        MessageService messageService = new MessageService("hello world");
        Thread t1 = new Thread(() -> System.out.println(messageService.getMsg()));
        Thread t2 = new Thread(() -> System.out.println(messageService.getMsg()));

        t1.start();
        t2.start();
    }
}

/*
If we need to share state between different threads,
we can create thread-safe classes by making them immutable.

Immutability is a powerful,
language-agnostic concept,
and it's fairly easy to achieve in Java.

To put it simply,
a class instance is immutable when its internal state can't be modified after it has been constructed.

The easiest way to create an immutable class in Java is by declaring all the fields private
and final
and not providing setters
 */