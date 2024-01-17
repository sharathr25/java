package org.pi.headfirstdesignpatterns.behaviour.iterator.sollution;

import org.pi.headfirstdesignpatterns.behaviour.iterator.common.MenuItem;

import java.util.Iterator;
import java.util.List;

public class PanCakeMenuIterator implements Iterator<MenuItem> {
    private final List<MenuItem> menuItems;
    private int i = 0;

    public PanCakeMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return i != menuItems.size();
    }

    @Override
    public MenuItem next() {
        return menuItems.get(i++);
    }
}
