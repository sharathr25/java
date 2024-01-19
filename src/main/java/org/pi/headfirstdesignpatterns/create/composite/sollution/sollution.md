* We can use **Composite Pattern** to solve this
* The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
* `DinerManu` can have `MenuItems` as leaves as well other menus like `DesertMenu`
* And all the nodes implements a common interface i.e `MenuComponent`.
* If node is leaf node it will implement whatever methods necessary and leave other methods as unsupported, for example in our current scenario `MenuItem` will be a leaf node and it will implement  `getName`,`getDescription`,`getPrice`,`isVegetarian`
* If node is not a leaf node and it want contains some more nodes as children that also can be done, since the interface supports this. here the implementation will include `addNode`, `removeNode` and `getNode`