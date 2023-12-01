package org.pi.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BrowserHistory {
    private final Stack<String> urls = new Stack<>();

    void push(String url) {
        urls.push(url);
    }

    String pop() {
        return urls.pop();
    }

    Iterator<String> createIterator() {
        return new ListIterator(this);
    }

//    check iterator-pattern.md
//    public List<String> getUrls() {
//        return urls;
//    }

    static class ListIterator implements Iterator<String> {
        private final BrowserHistory history;
        private int index;

        ListIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public void next() {
            index++;
        }
    }
}
