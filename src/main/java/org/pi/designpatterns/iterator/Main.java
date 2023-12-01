package org.pi.designpatterns.iterator;

public class Main {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();

        history.push("www.google.com");
        history.push("www.youtube.com");
        history.pop();
        history.push("www.facebook.com");

//        check iterator-pattern.md
//        for (int i = 0; i < history.getUrls().size(); i++) {
//            System.out.println(history.getUrls().get(i));
//        }


        Iterator<String> iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
