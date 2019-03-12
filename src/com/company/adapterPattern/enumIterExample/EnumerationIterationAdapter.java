package com.company.adapterPattern.enumIterExample;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by Loky on 12/03/2019.
 */
public class EnumerationIterationAdapter<T> implements Iterator<T> {

    private Enumeration<T> enumeration;

    public EnumerationIterationAdapter(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return enumeration.nextElement();
    }

}
