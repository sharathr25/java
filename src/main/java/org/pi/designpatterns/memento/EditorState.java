package org.pi.designpatterns.memento;

// MEMENTO
public class EditorState {
    public String getContent() {
        return content;
    }

    private String content;

    public EditorState(String content) {
        this.content = content;
    }
}
