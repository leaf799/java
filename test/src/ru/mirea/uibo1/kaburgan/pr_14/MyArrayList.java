package ru.mirea.uibo1.kaburgan.pr_14;

public class MyArrayList<E> {

    private Object[] data;
    private int size = 0;

    public MyArrayList() {
        data = new Object[10];
    }

    public void add(E element) {
        if (size == data.length)
            expand();
        data[size++] = element;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (size == data.length) expand();

        for (int i = size; i > index; i--)
            data[i] = data[i - 1];

        data[index] = element;
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return (E) data[index];
    }

    public int size() {
        return size;
    }

    private void expand() {
        Object[] newArr = new Object[data.length * 2];
        System.arraycopy(data, 0, newArr, 0, data.length);
        data = newArr;
    }
}
