package org.pi.headfirstdesignpatterns.structure.adapter.problem;

public class StandardACPlug {
    private StandardLine line;
    private StandardNeutral neutral;

    StandardACPlug() {
        this.line = new StandardLine(240);
        this.neutral = new StandardNeutral(240);
    }

    public StandardLine getLine() {
        return line;
    }

    public StandardNeutral getNeutral() {
        return neutral;
    }
}
