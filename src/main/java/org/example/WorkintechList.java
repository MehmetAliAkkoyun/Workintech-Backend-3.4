package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList {

    @Override
    public boolean add(Object element) {
        if (this.contains(element)) {
            return false;
        }
        return super.add(element);
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object element) {
        boolean removed = super.remove(element);
        if (removed) {
            this.sort();
        }
        return removed;
    }
}