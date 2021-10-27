package com.company;

public interface IntList <E> extends Iterable<E>{
    boolean add(E e);
    E get(int index);
    void remove(int index);
    int size();
    void update(int index, E e);




}
