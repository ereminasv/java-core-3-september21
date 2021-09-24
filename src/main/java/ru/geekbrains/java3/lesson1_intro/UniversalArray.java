package ru.geekbrains.java3.lesson1_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniversalArray<T> {
    private T[] elem;
    public UniversalArray(T... elem) {
        this.elem = elem;
    }

    public T[] getElem() {
        return elem;
    }

    public void setElem(T[] elem) {
        this.elem = elem;
    }

    public void changeArr(int ind1, int ind2) {
        T freeElem = elem [ind1];
        elem [ind1] = elem[ind2];
        elem [ind2] = freeElem;
    }

    public void transformationArr() {
        List<T> List = new ArrayList<>(Arrays.asList(elem));
        System.out.println(List);
    }
}
