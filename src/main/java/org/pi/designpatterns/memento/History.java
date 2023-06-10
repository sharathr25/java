package org.pi.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

// CARE TAKER
public class History {
    private List<EditorState> states = new ArrayList<>();

    public History(EditorState initialState) {
        states.add(initialState);
    }

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        int lastIndex = states.size() - 1;
        if (lastIndex < 0) throw new IllegalStateException();
        EditorState lastState = states.get(lastIndex);
        states.remove(lastIndex);

        return lastState;
    }
}
