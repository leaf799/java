package ru.mirea.uibo1.kaburgan.pr_5.number_9;

import java.util.Deque;
import java.util.LinkedList;

public class UndoStringBuilder {
    private final StringBuilder sb = new StringBuilder();
    private final Deque<Runnable> history = new LinkedList<>();

    public UndoStringBuilder append(String s) {
        int len = s == null ? 0 : s.length();
        sb.append(s);
        history.push(() -> sb.delete(sb.length() - len, sb.length()));
        return this;
    }

    public UndoStringBuilder delete(int start, int end) {
        String removed = sb.substring(start, end);
        sb.delete(start, end);
        history.push(() -> sb.insert(start, removed));
        return this;
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.pop().run();
        }
    }

    @Override
    public String toString() { return sb.toString(); }

    // тест
    public static void main(String[] args) {
        UndoStringBuilder usb = new UndoStringBuilder();
        usb.append("Hello ");
        usb.append("World");
        System.out.println(usb);
        usb.delete(5, 6); // remove space
        System.out.println(usb);
        usb.undo();
        System.out.println("after undo: " + usb);
        usb.undo();
        System.out.println("after undo2: " + usb);
    }
}
