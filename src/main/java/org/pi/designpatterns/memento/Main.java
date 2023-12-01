package org.pi.designpatterns.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History(editor.createState());

        editor.setContent("hello howr u?");
        history.push(editor.createState());
        System.out.println(editor.getContent());

        editor.restoreState(history.pop());

        editor.setContent("hello how r u?");
        history.push(editor.createState());
        System.out.println(editor.getContent());
    }
}
