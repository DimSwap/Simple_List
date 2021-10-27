package com.company;

public class Main {

    public static void main(String[] args) {
        IntArrayList<String> str = new IntArrayList<>();
        str.add("first");
        str.add("second");
        str.add("tree");
        System.out.println("-----------------");
        str.update(2,"six");
        System.out.println(str.get(1));
        System.out.println("-----------------");

        System.out.println("Размер: "+str.size());
        System.out.println("-----------------");

        str.remove(1);
        System.out.println(str.get(1));
        System.out.println("-----------------");

    }
}
