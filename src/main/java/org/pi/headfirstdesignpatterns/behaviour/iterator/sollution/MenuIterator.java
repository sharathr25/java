package org.pi.headfirstdesignpatterns.behaviour.iterator.sollution;

import org.pi.headfirstdesignpatterns.behaviour.iterator.common.MenuItem;

public interface MenuIterator {
    boolean hasNext();
    MenuItem next();
}
