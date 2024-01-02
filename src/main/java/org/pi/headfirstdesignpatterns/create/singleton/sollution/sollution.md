* to solve this we can make the `getInstance` method `synchronized`
```java
class SingleTon {
    private static SingleTon uniqueInstance;
    
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
            return uniqueInstance;
        }
    }
    // ...
}
```
But this will be too much, we need to synchronise only 1st time of the object creation

* we can eagerly create instance rather than lazily creating it
```java
class SingleTon {
    private static SingleTon uniqueInstance = new SingleTon();
    
    public static synchronized Singleton getInstance() {
        return uniqueInstance;
    }
    // ...
}
```

* Use “double-checked locking” to reduce the use of synchronization in `getInstance()`
```java
class SingleTon {
    private volatile static SingleTon uniqueInstance;

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingleTon.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
    // ...
}
```