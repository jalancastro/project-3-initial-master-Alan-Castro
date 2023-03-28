package com.example.iterable;

import java.util.*;

public class Bag<E> implements Container<E> {

    private ArrayList<E> bag;

    public Bag() {
        this.bag = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    @Override
    public int size() {
        return bag.size();
    }

    @Override
    public void add(E item) {
        this.bag.add(item);
    }

    @Override
    public Iterator iterator() {
        return this.bag.iterator();
    }
}
