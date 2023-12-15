# Strategy Pattern

### Program to a supertype.
* Program to an implementation would be:
```java
class Main {
    class Dog {
        public void bark() {
            System.out.println("bow bow!");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
```
*  programming to an interface/supertype would be:
```java
class Main {
    interface Animal {
        void makeSound();
    }

    class Dog implements Animal {
        public void makeSound() {
            bark();
        }

        public void bark() {
            System.out.println("bow bow!");
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
    }
}
```
* Even better, rather than hard-coding the instantiation of the subtype (like new Dog()) into the code, assign the concrete implementation object at runtime:
```java
class Main {
    public static void main(String[] args) {
        Animal a = getAnimal(); // We don’t know WHAT the actual animal subtype is... all we care about is that it knows how to respond to makeSound().
        a.makeSound();
    }
}
```

### Favor composition over inheritance.
* Inheritance way:
  * below `MallardDuck` gets `fly` method by inheritance
```java
class Main {
    class Duck {
        public void fly() {
            System.out.println("I believe I can fly");
        }
    }
    
    class MallardDuck extends Duck {}

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
    }
}
```
* Composition way:
  * below `MallardDuck` provides `FlyingBehavior` to `Duck` class.
  * This makes it easier to later change the behaviour at run time
  * Or create new Ducks with new flying behaviour for example 'no fly'
```java
class Main {
    interface FlyingBehavior {
        void fly();
    }
    
    class Duck {
        FlyingBehavior flyingBehavior;
        
        Duck(FlyingBehavior flyingBehavior) {
            this.flyingBehavior = flyingBehavior;
        }
        
        void performFly() {
            flyingBehavior.fly();
        }
    }
    
    class FlyWithWings implements FlyingBehavior {
        void fly() {
            System.out.println("I believe I can fly");
        }
    }
    
    class MallardDuck extends Duck {
        MallardDuck() {
            super(new FlyWithWings());
        }
    }

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
    }
}
```