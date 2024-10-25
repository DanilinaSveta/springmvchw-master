package ru.nnov.nntu.vst.demo.models;

import java.util.Objects;

public class Control {
    private TypeOfControl type;
    private byte mark;

    public Control(TypeOfControl type) {
        this.type = type;
    }

    public TypeOfControl getType() {
        return type;
    }

    public void setType(TypeOfControl type) {
        this.type = type;
    }

    public byte getMark() {
        return mark;
    }

    public void setMark(byte mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Control{" +
                "type=" + type +
                ", mark=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Control control = (Control) o;
        return mark == control.mark && type == control.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, mark);
    }
}
