package by.it.yatsevich.jd01_11;

import java.util.*;

class SetC<T> implements Set<T> {
    private T[] elements = (T[]) new Object[]{};
    private ListB<T> list = new ListB<>();

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        if (size()!=0)
            return list.iterator();
        else {
            return null;
        }
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (list.contains(t)) return false;
        else return list.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {

        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean value = false;
        for (Object o : c) {
            if(add((T)o)) value=true;
        }
        return value;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
       // if (contains(c)){
            int value =0;
            for (Object o : c) {
                remove(o);value++;
            }if (value<=c.size()) return true;
        //}
        return false;
    }



    @Override
    public void clear() {
        list.clear();
    }
}
