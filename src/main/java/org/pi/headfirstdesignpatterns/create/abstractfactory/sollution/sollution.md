* we can solve the problem using **Abstract Factory Pattern**
* The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
* Abstract Factory allows a client to use an abstract interface to
  create a set of related products without knowing (or caring) about the concrete products that
  are actually produced. In this way, the client is decoupled from any of the specifics of the
  concrete products.
* For example `CheesePizza` is using `PizzaIngredientsFactory` in `prepare` method, without caring about the implementation, and hence decoupled
* This `PizzaIngredientsFactory` can be passed based on locality for example for `CheesePizza` we can pass `NYPizzaIngredientsFactory` or `ChicagoIngredientsFactory`