package org.pi.designpatterns.memento;

import java.util.Stack;

// CARE TAKER
public class History {
    private final Stack<EditorState> states = new Stack<>();

    public History(EditorState initialState) {
        states.push(initialState);
    }

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        return states.pop();
    }
}
