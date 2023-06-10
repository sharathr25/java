package org.pi.designpatterns.memento;

// ORIGINATOR
public class Editor {
    private String content;

    Editor() {
        content = "";
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restoreState(EditorState state) {
        content = state.getContent();
    }
}
