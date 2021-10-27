package com.company;

import java.util.Iterator;

class ArrayIterator<E> implements Iterable<E> {
    private int index = 0;
    E[] values;
    ArrayIterator(E[] values){
        this.values = values;
    }

    @Override
    public boolean hasNext()
    {
        return index < values.length;
    }

    @Override
    public E next() {

        return values[index++];
    }
}
