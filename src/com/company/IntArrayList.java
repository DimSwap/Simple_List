package com.company;



public class IntArrayList<E> implements IntList<E> {

    private E[] values;

    public IntArrayList() {
        this.values = (E[]) new Object[0];
    }


    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;

    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public void remove(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountEtemAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values,index,amountEtemAfterIndex);
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }

}

