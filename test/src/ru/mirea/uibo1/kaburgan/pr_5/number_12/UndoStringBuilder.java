package ru.mirea.uibo1.kaburgan.pr_5.number_12;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/**
 * Простая реализация StringBuilder с поддержкой undo.
 * Делегирует операции стандартному StringBuilder и хранит обратные команды.
 */
public class UndoStringBuilder {
    private final StringBuilder sb = new StringBuilder();
    private final Deque<Runnable> history = new LinkedList<>();

    public UndoStringBuilder append(String s) {
        String toAppend = s == null ? "null" : s;
        int len = toAppend.length();
        sb.append(toAppend);
        // push undo: удалить добавленные символы
        history.push(() -> sb.delete(sb.length() - len, sb.length()));
        return this;
    }

    public UndoStringBuilder delete(int start, int end) {
        // нормализация границ (будет бросать исключения как и обычный StringBuilder)
        String removed = sb.substring(start, end);
        sb.delete(start, end);
        // push undo: вставить удалённую подстроку обратно
        history.push(() -> sb.insert(start, removed));
        return this;
    }

    public UndoStringBuilder insert(int offset, String s) {
        String toInsert = s == null ? "null" : s;
        sb.insert(offset, toInsert);
        int len = toInsert.length();
        history.push(() -> sb.delete(offset, offset + len));
        return this;
    }

    public UndoStringBuilder replace(int start, int end, String str) {
        String before = sb.substring(start, end);
        sb.replace(start, end, Objects.toString(str, "null"));
        history.push(() -> sb.replace(start, start + (str == null ? 4 : str.length()), before));
        return this;
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.pop().run();
        } else {
            System.out.println("Нечего отменять.");
        }
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    // Тестовый main
    public static void main(String[] args) {
        UndoStringBuilder usb = new UndoStringBuilder();
        usb.append("Hello");
        usb.append(" World");
        System.out.println("После append: " + usb);
        usb.delete(5, 6); // удалить пробел
        System.out.println("После delete(5,6): " + usb);
        usb.undo();
        System.out.println("После undo(): " + usb);
        usb.replace(0,5,"Hi");
        System.out.println("После replace: " + usb);
        usb.undo();
        System.out.println("После undo(): " + usb);
    }
}