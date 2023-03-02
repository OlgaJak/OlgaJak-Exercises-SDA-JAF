package Generics;

public class Library <T extends Media>{
    private T[] elements;

    public Library(T[] elements){
        this.elements = elements;

    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }
}
