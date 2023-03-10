package Lab2;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class OneWayLinkedList<E> implements IList<E> {
    private int size;

    private class Element {
        public Element(E e) {
            this.object = e;
        }

        E object;
        Element next = null;
    }

    Element sentinel;

    private class InnerIterator implements Iterator<E> {
        private Element actual;

        public InnerIterator() {
            actual = sentinel.next;
        }

        @Override
        public boolean hasNext() {
            return sentinel != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements to show");
            }
            E object = sentinel.object;
            actual = sentinel.next;
            return object;
        }
    }

    public OneWayLinkedList() {
        this.size = 0;
        sentinel = new Element(null);
        sentinel.next = null;
    }

    @Override
    public Iterator<E> iterator() {
        return new InnerIterator();
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(E e) {
        Element newElement = new Element(e);
        newElement.next = sentinel.next;
        sentinel.next = newElement;
        return true;
    }

    @Override
    public void add(int index, E element) throws NoSuchElementException {
        if (index >= size || index < 0) {
            throw new NoSuchElementException("Wrong index");
        }
        Element newElement = new Element(element);
        Element current = sentinel;

        for (int i = 0; i < size; i++) {
            current = current.next;
        }
        newElement.next = current.next;
        current.next = newElement;
        size++;
    }

    @Override
    public void clear() {
        size = 0;
        sentinel.next = null;
    }

    @Override
    public boolean contains(E element) {
        for (Element current = sentinel.next; current != null; current = current.next) {
            if (current.object.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) throws NoSuchElementException {
        if (index >= size || index < 0) {
            throw new NoSuchElementException("Wrong index");
        }

        Element element = sentinel.next;

        for (int i = 0; i < index; i++) {
            element = element.next;
        }

        return element.object;
    }

    @Override
    public E set(int index, E element) throws NoSuchElementException {
        if (index >= size || index < 0) {
            throw new NoSuchElementException("Wrong index");
        }

        Element current = sentinel.next;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        E oldObject = current.object;
        current.object = element;

        return oldObject;
    }

    @Override
    public int indexOf(E element) {
        int ind = 0;

        for (Element current = sentinel.next; current != null; current = current.next) {
            if (current.object.equals(element)) {
                return ind;
            }
            ind++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E remove(int index) throws NoSuchElementException {
        if (index >= size || index < 0) {
            throw new NoSuchElementException("Wrong index");
        }
        //TODO
        return null;
    }

    @Override
    public boolean remove(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size() {
        return size;
    }

}
