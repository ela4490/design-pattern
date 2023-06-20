package com.design.pattern;

public interface Iterator<T> {

    boolean hasNext();

    Vertex<T> getNext();

    void reset();

}