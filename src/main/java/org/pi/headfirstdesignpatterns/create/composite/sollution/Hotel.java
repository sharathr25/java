package org.pi.headfirstdesignpatterns.create.composite.sollution;

public class Hotel {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        dinerMenu.add(new MenuItem(
                "Vegetarian BLT",
                "(Fakin’) Bacon with lettuce & tomato on whole wheat",
                true,
                2.99));
        dinerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99));
        dinerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false,
                3.29));
        dinerMenu.add(new MenuItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,
                3.05));

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59));

        dessertMenu.add(new MenuItem("Honey cake", "Honey cake", true, 2.99));
        dessertMenu.add(new MenuItem("Jamoon", "Jamoon", true, 2.99));
        dessertMenu.add(new MenuItem("Ice Cream ", "Ice Cream ", true, 3.49));
        dessertMenu.add(new MenuItem("Halwa", "Halwa", true, 3.59));

        cafeMenu.add(new MenuItem("Cofee", "Coffee", true, 1.00));
        cafeMenu.add(new MenuItem("Cofee", "Tea", true, 1.00));

        dinerMenu.add(dessertMenu);

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(pancakeHouseMenu);

        Waitress waitress = new Waitress(allMenus);

        waitress.print();
    }
}
