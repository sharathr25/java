* We are seeing a problem in `Waitress` class
* pan cake menu items and diner menu items are two different interfaces
* because of this we have 2 ways of looping
* looping a list and an array
```java
public void menu() {
    List<MenuItem> panCakeHouseMenuMenuItems = panCakeHouseMenu.getMenuItems();
    for (int i = 0; i < panCakeHouseMenuMenuItems.size(); i++) {
        // ...
    }

    MenuItem[] dinerMenuMenuItems = dinerMenu.getMenuItems();
    for (int i = 0; i < dinerMenuMenuItems.length; i++) {
        // ...
    }
}
```
* there is a restriction and we can't change the implementation of the menus, since that will too much work
* because of this the maintenance of the code will be hard