package org.pi.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private final List<String> urls = new ArrayList<>();

    void push(String url) {
        urls.add(url);
    }

    String pop() {
        int lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastIndex);
        return lastUrl;
    }

    Iterator<String> createIterator() {
        return new ListIterator(this);
    }

//    check notes.md
//    public List<String> getUrls() {
//        return urls;
//    }

    static class ListIterator implements Iterator<String> {
        private BrowserHistory history;
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
