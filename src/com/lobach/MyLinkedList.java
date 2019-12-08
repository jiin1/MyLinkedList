package com.lobach;

import java.util.Objects;


public class MyLinkedList<E> implements ILinkedList<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;


    public MyLinkedList() {
        this.size = 0;
    }

    public void add(E element) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(l, element, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;

    }


    public void add(int index, E element) {
        if (index < 0 && index > size)
            throw new IndexOutOfBoundsException("index " + index + " is not in bound");

        if (index == size) {
            add(element);
        } else {
            Node<E> ok = node(index);
            Node<E> pred = ok.prev;
            Node<E> newNode = new Node<>(pred, element, ok);
            ok.prev = newNode;
            if (pred == null)
                first = newNode;
            else
                pred.next = newNode;
            size++;
        }
    }

    private Node<E> node(int index) {

        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    @Override
    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;

    }

    @Override
    public E get(int index) {
        Node<E> ok = node(index);
        return ok.item;
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (element.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        if (index < 0 && index > size)
            throw new IndexOutOfBoundsException("index " + index + " is not in bound");
        Node<E> ok = node(index);
        final E element = ok.item;
        final Node<E> next = ok.next;
        final Node<E> prev = ok.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            ok.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            ok.next = null;
        }

        ok.item = null;
        size--;
        return element;

    }

    @Override
    public E set(int index, E element) {
        if (index < 0 && index > size)
            throw new IndexOutOfBoundsException("index " + index + " is not in bound");
        Node<E> x = node(index);
        E oldV = x.item;
        x.item = element;
        return oldV;

    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public E[] toArray(E[] e) {
        if (e.length < size)
            throw new java.lang.NegativeArraySizeException("Your array too small for this list");
        int i = 0;
        Object[] result = e;
        for (Node<E> x = first; x != null; x = x.next) {
            result[i] = x.item;
            i++;
        }
        if (e.length > size)
            e[size] = null;

        return e;
    }


    @Override
    public Object[] toArray() {
        Object[] obj = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            obj[i] = x.item;
            i++;
        }
        return obj;
    }


    @Override
    public MyIterator<E> iterator() {
        return new MyIterator<E>();
    }


    private class MyIterator<A> implements java.util.Iterator {
        int count=0;
        Object y;


        @Override
        public boolean hasNext() {
            return count < size;
        }

        @Override
        public Object next() {
            E var=get(count);
            count++;
            if (count == size)
                count = 0;
            return var;
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> x = first;
        for (int i = 0; i < size; i++) {
            sb.append(x.toString(i));
            x = x.next;
        }
        return sb.toString();
    }


    private class Node<A> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;

            this.prev = prev;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node<?> node = (Node<?>) o;
            return item.equals(node.item) &&
                    next.equals(node.next) &&
                    prev.equals(node.prev);
        }



        private String toString(int i) {
            return "  Node " + i + " {" +
                    "item=" + item +
                    "}\n";
        }
    }


}

