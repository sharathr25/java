package org.pi.designpatterns.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History(editor.createState());

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());

        System.out.println(editor.getContent());


    }
}
