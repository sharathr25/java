* We can solve the problem using **Iterator pattern**
* The **Iterator Pattern** provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
* We have implemented the looping logic in `DinerMenuIterator` and `PanCakeMenuIterator` for `DinerMenu` and `PanCakeMenu` respectively.
* Basically `MenuIterator` which is a common interface that can used to loop
* And in future in `DinerMenu` changes its underlying data structure from `List` to something else, only `DinerMenuIterator` we need to change that's it
* When we add a new menu, we need to follow the same procedure of creating an iterator so the looping logic in `Waitress` class won't change