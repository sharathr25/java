* We can solve this problem using `Template Method` pattern
* The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.
* This pattern is all about creating a template for an algorithm
* We have abstracted the `prepareRecipe` method in `CaffeineBeverage` class
* This method is template method, which has steps to perform an algorithm
* few steps implementations which are common like `boilWater` and `pourInCup` are kept in `CaffeineBeverage` class
* and few steps implementations can be in the subclasses `Coffee` and `Tea` specific to them
* and also `CaffeineBeverage` have a hook `customerWantsCondiments` subclass can override this method to change template method behaviour

```java
abstract class AbstractClass {
    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    void concreteOperation() {
        // implementation here
    }
    
    void hook() { // subclass can override this
        // implementation here
    }
}
```