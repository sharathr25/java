package org.pi.headfirstdesignpatterns.behaviour.iterator.sollution;

import org.pi.headfirstdesignpatterns.behaviour.iterator.common.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] menuItems;

    private int i = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return !(i == menuItems.length || menuItems[i] == null);
    }

    @Override
    public MenuItem next() {
        return menuItems[i++];
    }
}
