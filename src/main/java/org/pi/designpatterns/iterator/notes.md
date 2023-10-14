# problem
`BrowserHistory` is a call where we can store URLs in a list.

In order to see all the URLs we are getting the URLs using `getUrls` method and looping over the URLs in `Main` class
```agsl
for (int i = 0; i < history.getUrls().size(); i++) {
    System.out.println(history.getUrls().get(i));
}
```
Imagine in future we decide to store the URLs in `BrowserHistory` in an `Array`. When we do this the `Main` class will break because of the loop we were doing earlier which works for `List` and not for `Array`

# solution
To solve this problem we can use **Iterator** pattern. Where we expose a Iterator using which we can loop over all the URLs. here we are using `ListIterator` of `BrowserHistory`
```agsl
Iterator<String> iterator = history.createIterator();
while (iterator.hasNext()) {
    System.out.println(iterator.current());
    iterator.next();
}
```
If we change internal implementation of `BrowserHistory` to store the URLs in an `Array` we just need to change `ListIterator` to `ArrayIterator` and change the logic accordingly.

The `Main` won't break.
