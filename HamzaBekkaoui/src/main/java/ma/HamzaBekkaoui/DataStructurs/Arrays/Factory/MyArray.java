package ma.HamzaBekkaoui.DataStructurs.Arrays.Factory;

import java.util.Iterator;

public class MyArray<Type> implements Array<Type> , Iterable<Type>{

    private static int DEFAULT_ARRAY_SIZE = 10;
    private int arraySize;

    private Type[] array;
    private int size = 0;

    public MyArray(){
        this.arraySize = this.DEFAULT_ARRAY_SIZE;
        array = (Type[]) new Object[this.arraySize];
    }

    public MyArray(int size){
        this.arraySize = size;
        array = (Type[]) new Object[this.arraySize];
    }

    @Override
    public Type add(Type item) {
        if(this.size >= this.arraySize)
            throw new ArrayIndexOutOfBoundsException();
        return this.array[size++] = item;
    }

    @Override
    public Type remove(int index) {
        validateIndex(index);
        this.size--;
        for (int i = index; i < size ; i++) {
            this.array[index] = this.array[index + 1];
        }

        return this.array[index];
    }

    @Override
    public Type remove(Type item) {
        int index = this.indexOf(item);
        return this.remove(index);
    }

    @Override
    public Type update(int index, Type item) {
        validateIndex(index);
        this.array[index] = item;
        return item;
    }

    @Override
    public int indexOf(Type item) {
        if(item instanceof Number){
            for (int i = 0; i < this.size; i++) {
                if (item == this.array[i]){
                    return i;
                }
            }
        }
        else {
            for (int i = 0; i < this.size; i++) {
                if (item.equals(this.array[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public Type get(int index) {
        validateIndex(index);
        return this.array[index];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(Type item) {
        return indexOf(item) >= 0;
    }

    @Override
    public Type[] copy() {
        // return this.array;
        // they will be both point at the same object , any change will affect both of them
        Type[] copyArray = (Type[]) new Object[size];
        for (int i = 0 ; i < size ; i++){
            copyArray[i] = array[i];
        }
        return copyArray;
    }

    @Override
    public Iterator<Type> iterator() {
        return new MyArrayIterator();
    }

    private class MyArrayIterator implements Iterator<Type>{

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Type next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements to iterate.");
            }
            return array[currentIndex++];
        }

    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("Index out of bounds: You are trying to access an element that doesn't exist.");
        }
    }

}
